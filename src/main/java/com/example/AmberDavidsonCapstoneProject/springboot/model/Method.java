package com.example.AmberDavidsonCapstoneProject.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Method")
public class Method {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "coffee_machine")
    private String coffeeMachine;

    @Column(name = "pourover")
    private String pourover;

    @Column(name = "french_press")
    private String frenchPress;

    @Column(name = "aeropress")
    private String aeropress;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCoffeeMachine() {
        return coffeeMachine;
    }

    public void setCoffeeMachine(String coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public String getPourover() {
        return pourover;
    }

    public void setPourover(String pourover) {
        this.pourover = pourover;
    }

    public String getFrenchPress() {
        return frenchPress;
    }

    public void setFrenchPress(String frenchPress) {
        this.frenchPress = frenchPress;
    }

    public String getAeropress() {
        return aeropress;
    }

    public void setAeropress(String aeropress) {
        this.aeropress = aeropress;
    }
}