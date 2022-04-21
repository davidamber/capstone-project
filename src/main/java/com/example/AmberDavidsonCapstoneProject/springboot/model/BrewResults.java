package com.example.AmberDavidsonCapstoneProject.springboot.model;

import javax.persistence.*;

@Entity
@Table(name = "brew_results")
public class BrewResults {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_id")
    private long userId;

    @Column(name = "ratio_value")
    private long ratioValue;

    @Column(name = "coffee")
    private double coffee;

    @Column(name = "water")
    private double water;

    @Column(name = "method_name")
    private String methodName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public double getCoffee() {
        return coffee;
    }

    public void setCoffee(double coffee) {
        this.coffee = coffee;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
}