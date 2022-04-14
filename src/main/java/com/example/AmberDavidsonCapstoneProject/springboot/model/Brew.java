package com.example.AmberDavidsonCapstoneProject.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Brew")
public class Brew {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long brewId;

    @Column(name = "type_id")
    private String typeId;

    @Column(name = "strength_id")
    private String strengthId;

    @Column(name = "ratio_id")
    private String ratioId;

    public long getBrewId() {
        return brewId;
    }

    public void setBrewId(long brewId) {
        this.brewId = brewId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getStrengthId() {
        return strengthId;
    }

    public void setStrengthId(String strengthId) {
        this.strengthId = strengthId;
    }

    public String getRatioId() {
        return ratioId;
    }

    public void setRatioId(String ratioId) {
        this.ratioId = ratioId;
    }
}