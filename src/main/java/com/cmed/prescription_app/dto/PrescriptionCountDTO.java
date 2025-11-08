package com.cmed.prescription_app.dto;

import java.time.LocalDate;

public class PrescriptionCountDTO {
    private LocalDate date;
    private long count;

    // Constructors
    public PrescriptionCountDTO(LocalDate date, long count) {
        this.date = date;
        this.count = count;
    }

    // Getters and Setters
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}