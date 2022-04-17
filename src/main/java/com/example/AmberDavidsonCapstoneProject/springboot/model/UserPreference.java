package com.example.AmberDavidsonCapstoneProject.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "preference")
public class UserPreference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "method_id)
    private long brewMethodId;

    @Column(name = "user_id")
    private long userId;

    @Column(name = "method_name")
    private String brewMethodName;

    public long getBrewMethodId() {
        return brewMethodId;
    }

    public void setBrewMethodId(long brewMethodId) {
        this.brewMethodId = brewMethodId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getBrewMethodName() {
        return brewMethodName;
    }

    public void setBrewMethodName(String brewMethodName) {
        this.brewMethodName = brewMethodName;
    }
}