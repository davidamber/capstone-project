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

    // @transient
    private int cups;

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

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    @Override
    public String toString() {
        return "UserPreference{" +
                "brewMethodId=" + brewMethodId +
                ", userId=" + userId +
                ", brewMethodName='" + brewMethodName + '\'' +
                ", cups=" + cups +
                '}';
    }
}