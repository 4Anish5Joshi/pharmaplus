package com.pharmatest.pharma.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pharmatest.pharma.model.Patient;
import com.pharmatest.pharma.repositories.PatientRepository;


@Controller
public class PatientController {

	@Autowired
    PatientRepository patientRepository;

    @GetMapping("/booknow")

    public String getRegPage(@ModelAttribute("patient") Patient patient) {
        return "labt"; 
    }

    @PostMapping("/booknow")
    public String savePatient(@ModelAttribute("patient") Patient patient, Model model) {
            patientRepository.save(patient);
            model.addAttribute("message", "Lab test booked successfully");
    
        return "labt"; // Return to the booking form
    }
   

    @GetMapping("/patient")
    public String patientsPage(Model model){
        List<Patient> listOfPatient = patientRepository.findAll();
        model.addAttribute("patient", listOfPatient);
        return "patient";
    }

}