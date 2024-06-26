package com.spring.calculator.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "user")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //Email acts as the user username!
    @Column(name = "email")
    private String username;
    private String password;
    @Transient
    private String cnfPassword;
    private String role;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Number> numbers;

    public User(){}

    public User(String username, String password, String cnfPassword) {
        this.username = username;
        this.password = password;
        this.cnfPassword = cnfPassword;
    }

    public User(int id, String username, String password, String cnfPassword) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.cnfPassword = cnfPassword;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getCnfPassword() {
        return cnfPassword;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCnfPassword(String cnfPassword) {
        this.cnfPassword = cnfPassword;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Number> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Number> numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + username + '\'' +
                ", password='" + password + '\'' +
                ", cnfPassword='" + cnfPassword + '\'' +
                '}';
    }
}
