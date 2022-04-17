package com.example.AmberDavidsonCapstoneProject.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ratio")
public class Ratio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ratioId;

    @Column(name = "ratio_value")
    private String ratioValue;

    @Column(name = "method_id")
    private long methodId;

    public long getRatioId() {
        return ratioId;
    }

    public void setRatioId(long ratioId) {
        this.ratioId = ratioId;
    }

    public String getRatioValue() {
        return ratioValue;
    }

    public void setRatioValue(String ratioValue) {
        this.ratioValue = ratioValue;
    }

    public long getMethodId() {
        return methodId;
    }

    public void setMethodId(long methodId) {
        this.methodId = methodId;
    }
}
