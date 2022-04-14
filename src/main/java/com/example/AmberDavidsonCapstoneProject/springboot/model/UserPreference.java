package com.example.AmberDavidsonCapstoneProject.springboot.model;

import javax.persistence.*;

@Entity
@Table(name = "brew_method")
public class UserPreference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long brewMethodId;

    @Column(name = "user_id")
    private long userId;

    @Column(name = "method_name")
    private String methodName;



}