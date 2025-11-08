package com.cmed.prescription_app.repository;

import com.cmed.prescription_app.dto.PrescriptionCountDTO; // <-- Import the DTO
import com.cmed.prescription_app.model.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query; // <-- Import the Query annotation
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {

    // This method is for the dashboard filter
    List<Prescription> findByPrescriptionDateBetween(LocalDate startDate, LocalDate endDate);

    // This new method is for the "Day-wise prescription count" report
    @Query("SELECT new com.cmed.prescription_app.dto.PrescriptionCountDTO(p.prescriptionDate, COUNT(p)) " +
            "FROM Prescription p GROUP BY p.prescriptionDate ORDER BY p.prescriptionDate DESC")
    List<PrescriptionCountDTO> countPrescriptionsByDay();
}