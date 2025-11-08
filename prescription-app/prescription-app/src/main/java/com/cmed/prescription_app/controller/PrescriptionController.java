package com.cmed.prescription_app.controller;

import com.cmed.prescription_app.dto.PrescriptionCountDTO;
import com.cmed.prescription_app.model.Prescription;
import com.cmed.prescription_app.service.PrescriptionService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.List;

@Controller
public class PrescriptionController {

    private final PrescriptionService prescriptionService;

    public PrescriptionController(PrescriptionService prescriptionService) {
        this.prescriptionService = prescriptionService;
    }

    // Display the list of prescriptions with a date filter
    @GetMapping("/")
    public String viewDashboard(
            @RequestParam(name = "startDate", required = false) String startDateStr,
            @RequestParam(name = "endDate", required = false) String endDateStr,
            Model model) {

        LocalDate startDate, endDate;

        // Default to the current month if dates are not provided
        if (startDateStr == null || startDateStr.isEmpty() || endDateStr == null || endDateStr.isEmpty()) {
            LocalDate now = LocalDate.now();
            startDate = now.with(TemporalAdjusters.firstDayOfMonth());
            endDate = now.with(TemporalAdjusters.lastDayOfMonth());
        } else {
            startDate = LocalDate.parse(startDateStr);
            endDate = LocalDate.parse(endDateStr);
        }

        List<Prescription> prescriptionList = prescriptionService.findByDateRange(startDate, endDate);
        model.addAttribute("prescriptions", prescriptionList);
        model.addAttribute("startDate", startDate);
        model.addAttribute("endDate", endDate);

        return "dashboard"; // Renders dashboard.html
    }

    // Show form to add a new prescription
    @GetMapping("/showNewPrescriptionForm")
    public String showNewPrescriptionForm(Model model) {
        model.addAttribute("prescription", new Prescription());
        return "prescription_form"; // Renders prescription_form.html
    }

    // Save a new or updated prescription
    @PostMapping("/savePrescription")
    public String savePrescription(@Valid @ModelAttribute("prescription") Prescription prescription,
            BindingResult bindingResult) {
        // If there are validation errors, return to the form
        if (bindingResult.hasErrors()) {
            return "prescription_form";
        }
        prescriptionService.save(prescription);
        return "redirect:/";
    }

    // Show form to edit an existing prescription
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
        Prescription prescription = prescriptionService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid prescription Id:" + id));
        model.addAttribute("prescription", prescription);
        return "prescription_form"; // Renders prescription_form.html
    }

    // Delete a prescription
    @GetMapping("/deletePrescription/{id}")
    public String deletePrescription(@PathVariable(value = "id") long id) {
        this.prescriptionService.deleteById(id);
        return "redirect:/";
    }

    // Add this method to your PrescriptionController.java
    @GetMapping("/report")
    public String showReport(Model model) {
        List<PrescriptionCountDTO> dailyCounts = prescriptionService.getDailyPrescriptionCount();
        model.addAttribute("dailyCounts", dailyCounts);
        return "report"; // Renders a new report.html page
    }
}