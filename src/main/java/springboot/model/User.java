package springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

//    @Column(name = "username")
//    private String username;

    @Column(name = "email")
    private String email;
    public long getId() {
        return id;
    }

    @Column(name = "strength")
    private String strength;

    @Column(name = "method")
    private String method;

//    @Column(name = "password")
//    private String password;
//
//    @Column(name = "password2")
//    private String password2;

//    public void setId(long id) {
//        this.id = id;
//    }
//    public String getUsername() {
//        return username;
//    }
//    public void setUsername(String username) {
//        this.username = username;
//

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

//    public String getPassword() {
//        return password;
//    }
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getPassword2() {
//        return password2;
//    }
//    public void setPassword2(String password2) {
//        this.password2 = password2;
//    }
    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}