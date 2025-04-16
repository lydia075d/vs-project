package com.example.attendance.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String email;
    private String password;
    private String mobile;
    private String dob;

    public User() {}

    public User(String email, String password, String mobile, String dob) {
        this.email = email;
        this.password = password;
        this.mobile = mobile;
        this.dob = dob;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getMobile() { return mobile; }
    public String getDob() { return dob; }

    public void setId(Long id) { this.id = id; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setMobile(String mobile) { this.mobile = mobile; }
    public void setDob(String dob) { this.dob = dob; }
}