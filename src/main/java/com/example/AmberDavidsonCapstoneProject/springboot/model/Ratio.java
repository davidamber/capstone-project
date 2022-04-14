package com.example.AmberDavidsonCapstoneProject.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ratio")
public class Ratio {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ratioId;

    @Column(name = "ratio_name")
    private String ratioName;

    @Column(name = "ratio_value")
    private String ratioValue;

    public long getRatioId() {
        return ratioId;
    }

    public void setRatioId(long ratioId) {
        this.ratioId = ratioId;
    }

    public String getRatioName() {
        return ratioName;
    }

    public void setRatioName(String ratioName) {
        this.ratioName = ratioName;
    }

    public String getRatioValue() {
        return ratioValue;
    }

    public void setRatioValue(String ratioValue) {
        this.ratioValue = ratioValue;
    }
}
