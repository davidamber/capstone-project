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


    @Column(name = "ratio_id")
    private long ratioId;

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

    public long getRatioId() {
        return ratioId;
    }

    public void setRatioId(long ratioId) {
        this.ratioId = ratioId;
    }
}