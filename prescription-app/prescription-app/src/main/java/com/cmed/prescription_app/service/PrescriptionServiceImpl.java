package com.cmed.prescription_app.service;

import com.cmed.prescription_app.dto.PrescriptionCountDTO; // <-- Import the DTO
import com.cmed.prescription_app.model.Prescription;
import com.cmed.prescription_app.repository.PrescriptionRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {

    private final PrescriptionRepository prescriptionRepository;

    public PrescriptionServiceImpl(PrescriptionRepository prescriptionRepository) {
        this.prescriptionRepository = prescriptionRepository;
    }

    @Override
    public List<Prescription> findByDateRange(LocalDate startDate, LocalDate endDate) {
        return prescriptionRepository.findByPrescriptionDateBetween(startDate, endDate);
    }

    @Override
    public Optional<Prescription> findById(Long id) {
        return prescriptionRepository.findById(id);
    }

    @Override
    public Prescription save(Prescription prescription) {
        return prescriptionRepository.save(prescription);
    }

    @Override
    public void deleteById(Long id) {
        prescriptionRepository.deleteById(id);
    }

    // Add this new method to implement the report functionality
    @Override
    public List<PrescriptionCountDTO> getDailyPrescriptionCount() {
        // This simply calls the new method you created in the repository
        return prescriptionRepository.countPrescriptionsByDay();
    }
}