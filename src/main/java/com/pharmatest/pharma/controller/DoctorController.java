package com.pharmatest.pharma.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pharmatest.pharma.model.Doctor;
import com.pharmatest.pharma.service.DoctorService;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {
    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    // API endpoint to get all doctors (returns JSON/XML data)
    @GetMapping
    public List<Doctor> getAllDoctorsAPI() {
        return doctorService.getAllDoctors();
    }

    // HTML endpoint to render the doctor.html template
    @GetMapping("/doctors")
    public String getAllDoctors(Model model) {
        List<Doctor> doctors = doctorService.getAllDoctors();
        model.addAttribute("doctors", doctors);
        return "doctor"; // Renders the doctor.html template
    }
}
