package com.tobeto.spring.b.services.dtos.responses.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetOrderListResponse {
    //private LocalDate startDate;
    private double totalPrice;
    private String paymentType;
}
