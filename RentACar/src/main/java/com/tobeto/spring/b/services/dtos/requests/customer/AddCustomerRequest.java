package com.tobeto.spring.b.services.dtos.requests.customer;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCustomerRequest {

    @NotBlank(message = "It is mandatory to enter your name")
    private String name;
    @NotBlank(message = "It is mandatory to enter your surname")
    private String surName;
}
