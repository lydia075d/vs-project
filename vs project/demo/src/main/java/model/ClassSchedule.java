package com.example.attendance.model;

import jakarta.persistence.*;

@Entity
@Table(name = "classes")
public class ClassSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subject;
    private String time;

    public ClassSchedule() {}

    public ClassSchedule(String subject, String time) {
        this.subject = subject;
        this.time = time;
    }

    public Long getId() { return id; }
    public String getSubject() { return subject; }
    public String getTime() { return time; }

    public void setId(Long id) { this.id = id; }
    public void setSubject(String subject) { this.subject = subject; }
    public void setTime(String time) { this.time = time; }
}