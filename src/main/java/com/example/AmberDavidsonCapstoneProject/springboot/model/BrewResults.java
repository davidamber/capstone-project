package com.example.AmberDavidsonCapstoneProject.springboot.model;

import javax.persistence.*;

@Entity
@Table(name = "brew_results")
public class BrewResults {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long brewResultsId;

    @Column(name = "user_id")
    private long userId;


    @Column(name = "ratio_value")
    private long ratioValue;

    public long getBrewResultsId() {
        return brewResultsId;
    }

    public void setBrewResultsId(long brewResultsId) {
        this.brewResultsId = brewResultsId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getRatioValue() {
        return ratioValue;
    }

    public void setRatioValue(long ratioValue) {
        this.ratioValue = ratioValue;
    }
}