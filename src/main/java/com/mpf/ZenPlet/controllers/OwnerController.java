package com.mpf.ZenPlet.controllers;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.mpf.ZenPlet.models.Owner;
import com.mpf.ZenPlet.repositories.OwnerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class OwnerController {

    @Autowired
    private OwnerRepository ownerRepository;

    @GetMapping("/owners")
    public List<Owner> getOwners() {
        return ownerRepository.findAll();
    }

    @PostMapping("/save-owner")
    @ResponseBody
    public Owner saveOwner(@RequestBody Owner owner) {
        return ownerRepository.save(owner);
    }

    @RequestMapping(value = "/owner/id/{id}", method = RequestMethod.GET)
    public Owner getOwnerById(@PathVariable("id") long id) {
        return ownerRepository.findById(id).orElse(new Owner());
    }

    @RequestMapping(value = "/owner/name/{name}", method = RequestMethod.GET)
    public List<Owner> getOwnerByName(@PathVariable("name") String name) {
        return ownerRepository.findByName(name);
    }

    @RequestMapping(value = "/edit-owner/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Owner updateOwner(@PathVariable("id") long id, @RequestBody Owner owner) {
        owner.setOwnerId(id);
        return ownerRepository.save(owner);
    }

    @RequestMapping(value = "/delete-owner/{id}", method = RequestMethod.DELETE)
    public void deleteOwner(@PathVariable("id") long id) {
        Owner owner = ownerRepository.findById(id).get();
        if (owner != null) {
            ownerRepository.delete(owner);
        }
    }

    // Security
    @GetMapping("login-owner")
    public Owner login(@RequestParam("login") String login, @RequestParam("password") String password) {
        Owner owner = ownerRepository.loginOwner(login, password);

        if (owner != null) {
            if (owner.getToken() == null || owner.getToken().isEmpty()) {
                owner.setToken(getJWTToken(login));
                updateOwner(owner.getOwnerId(), owner);
            }
            return owner;
        }

        return new Owner();

    }

    private String getJWTToken(String username) {
        String secretKey = "mySecretKey";
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");

        String token = Jwts.builder().setId("softtekJWT").setSubject(username)
                .claim("authorities",
                        grantedAuthorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 600000))
                .signWith(SignatureAlgorithm.HS512, secretKey.getBytes()).compact();

        return "Bearer " + token;
    }
}
