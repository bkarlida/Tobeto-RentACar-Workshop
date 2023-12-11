package com.tobeto.spring.b.services.dtos.requests.bill;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddBillRequest {

    @NotNull(message = "Total Price cannot be null")
    @DecimalMin(value = "0.0", inclusive = false, message = "Total Price must be greater than 0")
    @DecimalMax(value = "100000.0", inclusive = true, message = "Total Price must be less than or equal to 100000")
    private double totalPrice;
}
