package com.example.attendance.model;

import jakarta.persistence.*;

@Entity
@Table(name = "attendance")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long userId;
    private String date;
    private boolean present;

    public Attendance() {}

    public Attendance(Long userId, String date, boolean present) {
        this.userId = userId;
        this.date = date;
        this.present = present;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public Long getUserId() { return userId; }
    public String getDate() { return date; }
    public boolean isPresent() { return present; }

    public void setId(Long id) { this.id = id; }
    public void setUserId(Long userId) { this.userId = userId; }
    public void setDate(String date) { this.date = date; }
    public void setPresent(boolean present) { this.present = present; }
}