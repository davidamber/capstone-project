package com.example.AmberDavidsonCapstoneProject.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Strength")
public class Strength {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long strengthId;

    @Column(name = "id")
    private long id;

    @Column(name = "strength_name")
    private String strengthName;

    @Column(name = "regular")
    private String lastName;

    @Column(name = "strong")
    private String strong;

    public long getStrengthId() {
        return strengthId;
    }

    public void setStrengthId(long strengthId) {
        this.strengthId = strengthId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStrengthName() {
        return strengthName;
    }

    public void setStrengthName(String strengthName) {
        this.strengthName = strengthName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStrong() {
        return strong;
    }

    public void setStrong(String strong) {
        this.strong = strong;
    }
}






