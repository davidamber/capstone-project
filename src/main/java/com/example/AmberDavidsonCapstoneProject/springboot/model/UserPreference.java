package com.example.AmberDavidsonCapstoneProject.springboot.model;

import javax.persistence.*;

@Entity
@Table(name = "preference")
public class UserPreference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long brewMethodId;

    @Column(name = "user_id")
    private long userId;

    @Column(name = "method_name")
    private String brewMethodName;

    // @transient
    private int cups;

    @ManyToOne(targetEntity = Ratio.class)
    @JoinColumn(name = "method_id", referencedColumnName = "method_id")
    private Ratio ratio;

    public long getBrewMethodId() {
        return brewMethodId;
    }

    public void setBrewMethodId(long MethodId) {
        this.brewMethodId = MethodId;
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

    public Ratio getRatio() {
        return ratio;
    }

    public void setRatio(Ratio ratio) {
        this.ratio = ratio;
    }

    @Override
    public String toString() {
        return "UserPreference{" +
                "MethodId=" + brewMethodId +
                ", userId=" + userId +
                ", brewMethodName='" + brewMethodName + '\'' +
                ", cups=" + cups +
                '}';
    }
}