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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "coffee_machine")
    private String coffeeMachine;

    @Column(name = "pour_over")
    private String pourover;

    @Column(name = "french_press")
    private String frenchPress;

    @Column(name = "aeropress")
    private String aeropress;
}