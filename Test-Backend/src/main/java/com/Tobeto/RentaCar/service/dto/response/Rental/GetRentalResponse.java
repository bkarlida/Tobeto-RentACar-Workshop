package com.Tobeto.RentaCar.service.dto.response.Rental;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetRentalResponse {
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate returnDate;
    private int startKilometer;
    private int endKilometer;
    private double totalPrice;
}
