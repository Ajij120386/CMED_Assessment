package com.cmed.prescription_app.service;

import com.cmed.prescription_app.dto.PrescriptionCountDTO; // <-- Import the DTO
import com.cmed.prescription_app.model.Prescription;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface PrescriptionService {

    // Methods for core CRUD operations
    List<Prescription> findByDateRange(LocalDate startDate, LocalDate endDate);

    Optional<Prescription> findById(Long id);

    Prescription save(Prescription prescription);

    void deleteById(Long id);

    // Add this new method signature for the report
    List<PrescriptionCountDTO> getDailyPrescriptionCount();
}