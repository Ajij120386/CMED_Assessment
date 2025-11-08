package com.cmed.prescription_app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@Entity
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Prescription date is mandatory")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate prescriptionDate;

    @NotBlank(message = "Patient name is mandatory")
    private String patientName;

    @NotNull(message = "Patient age is mandatory")
    @Min(value = 0, message = "Age cannot be negative")
    @Max(value = 120, message = "Please enter a valid age")
    private Integer patientAge;

    @NotBlank(message = "Patient gender is mandatory")
    private String patientGender;

    @Column(length = 1000)
    private String diagnosis;

    @Column(length = 1000)
    private String medicines;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate nextVisitDate;
}