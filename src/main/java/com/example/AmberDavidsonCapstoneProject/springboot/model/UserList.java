package com.example.AmberDavidsonCapstoneProject.springboot.model;

import com.example.AmberDavidsonCapstoneProject.springboot.security.Role;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "user_list")
public class UserList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long userId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;
    public long getId() {
        return userId;
    }

    @Column(name = "method_name")
    private String methodName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private Collection<UserPreference> userPreference;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private Collection<BrewResults> brewResults;

    public void setId(long id) {
        this.userId = userId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMethodName() {
        return methodName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
}






