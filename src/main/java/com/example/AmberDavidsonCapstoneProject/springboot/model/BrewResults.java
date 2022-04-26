package com.example.AmberDavidsonCapstoneProject.springboot.model;

import javax.persistence.*;
import java.util.Collection;

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

    @Override
    public String toString() {
        return "BrewResults{" +
                "id=" + id +
                ", userId=" + userId +
                ", ratioValue=" + ratioValue +
                ", coffee=" + coffee +
                ", water=" + water +
                ", methodName='" + methodName + '\'' +
                ", cups=" + cups +
                ", methodAndRatioPreference=" + methodAndRatioPreference +
                '}';
    }

    @Column(name = "cups")
    private int cups;

    @ManyToOne(targetEntity=UserPreference.class)
    @JoinColumn(name="preference_id", referencedColumnName="brewMethodId")
    private UserPreference methodAndRatioPreference;

//    @ManyToOne
//    @JoinColumn(name ="user_id", insertable=false, updatable=false)
//    private UserList userList;

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

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }
}