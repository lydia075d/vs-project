package com.example.attendance.controller;

import com.example.attendance.model.Attendance;
import com.example.attendance.repository.AttendanceRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {
    private final AttendanceRepository attendanceRepository;

    public AttendanceController(AttendanceRepository attendanceRepository) {
        this.attendanceRepository = attendanceRepository;
    }

    @PostMapping("/mark")
    public ResponseEntity<String> markAttendance(@RequestBody Attendance attendance) {
        attendanceRepository.save(attendance);
        return ResponseEntity.ok("Attendance marked!");
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<Attendance>> getAttendance(@PathVariable Long userId) {
        List<Attendance> attendanceList = attendanceRepository.findByUserId(userId);
        return ResponseEntity.ok(attendanceList);
    }
}