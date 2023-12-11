package com.tobeto.spring.b.services.dtos.requests.customer;

import jakarta.validation.constraints.Size;

public class AddCustomerResponseV2
{

    @Size(min = 11, max = 11, message = "Exactly 11 characters required")
    private String tcNo;
}
