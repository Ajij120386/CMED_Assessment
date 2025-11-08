package com.cmed.prescription_app.controller;

import com.cmed.prescription_app.model.Prescription;
import com.cmed.prescription_app.repository.PrescriptionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/v1/prescription")
public class PrescriptionRestController {

    private final PrescriptionRepository prescriptionRepository;

    public PrescriptionRestController(PrescriptionRepository prescriptionRepository) {
        this.prescriptionRepository = prescriptionRepository;
    }

    @GetMapping
    public List<Prescription> getAllPrescriptions() {
        return prescriptionRepository.findAll();
    }
}