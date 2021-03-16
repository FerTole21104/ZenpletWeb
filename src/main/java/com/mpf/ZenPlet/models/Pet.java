package com.mpf.ZenPlet.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
    private byte[] petImage;

    @Column(name = "pet_breed", nullable = true)
    private String petBreed;

    @Column(name = "pet_size", nullable = true)
    private String petSize;

    @Column(name = "pet_genre", nullable = true)
    private String petGenre;

    @ManyToMany()
    @JsonBackReference
    @JoinTable(name = "owner_pet", joinColumns = @JoinColumn(name = "pet_id"), inverseJoinColumns = @JoinColumn(name = "owner_id"))
    private Set<Owner> petOwners;

    // TODO many to many of others table

    public Pet() {
    }

    public Pet(long petId, String petName, byte[] petImage, String petBreed, String petSize, String petGenre) {
        this.petId = petId;
        this.petName = petName;
        this.petImage = petImage;
        this.petBreed = petBreed;
        this.petSize = petSize;
        this.petGenre = petGenre;
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

    public byte[] getPetImage() {
        return petImage;
    }

    public void setPetImage(byte[] petImage) {
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

}
