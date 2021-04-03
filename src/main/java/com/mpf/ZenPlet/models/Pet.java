package com.mpf.ZenPlet.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Pet")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long petId;

    @Column(name = "pet_name", nullable = true)
    private String petName;

    @Column(name = "pet_image", nullable = true)
    @Lob
    private String petImage;

    @Column(name = "pet_breed", nullable = true)
    private String petBreed;

    @Column(name = "pet_size", nullable = true)
    private String petSize;

    @Column(name = "pet_genre", nullable = true)
    private String petGenre;

    @JsonBackReference
    @ManyToOne
    private Owner petOwner;

    @OneToMany(mappedBy = "pet", cascade = CascadeType.REMOVE)
    private Set<LostPet> ownerLostPets;

    @OneToMany(mappedBy = "pet", cascade = CascadeType.REMOVE)
    private Set<PetVaccines> petVaccines;

    public Pet() {
    }

    public Pet(long petId, String petName, String petImage, String petBreed, String petSize, String petGenre,
            Owner petOwner) {
        this.petId = petId;
        this.petName = petName;
        this.petImage = petImage;
        this.petBreed = petBreed;
        this.petSize = petSize;
        this.petGenre = petGenre;
        this.petOwner = petOwner;
    }

    public long getPetId() {
        return petId;
    }

    public void setPetId(long petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetImage() {
        return petImage;
    }

    public void setPetImage(String petImage) {
        this.petImage = petImage;
    }

    public String getPetBreed() {
        return petBreed;
    }

    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }

    public String getPetSize() {
        return petSize;
    }

    public void setPetSize(String petSize) {
        this.petSize = petSize;
    }

    public String getPetGenre() {
        return petGenre;
    }

    public void setPetGenre(String petGenre) {
        this.petGenre = petGenre;
    }

    public Owner getPetOwner() {
        return petOwner;
    }

    public void setPetOwner(Owner petOwner) {
        this.petOwner = petOwner;
    }

    public Set<PetVaccines> getPetVaccines() {
        return petVaccines;
    }

    public void setPetVaccines(Set<PetVaccines> petVaccines) {
        this.petVaccines = petVaccines;
    }

}
