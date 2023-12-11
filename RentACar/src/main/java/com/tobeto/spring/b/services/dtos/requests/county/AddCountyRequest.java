package com.tobeto.spring.b.services.dtos.requests.county;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCountyRequest {

    @NotBlank(message = "You need to specify a County")
    private String name;
}
