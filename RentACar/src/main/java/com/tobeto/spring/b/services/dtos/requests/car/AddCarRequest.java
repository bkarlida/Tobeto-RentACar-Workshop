package com.tobeto.spring.b.services.dtos.requests.car;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCarRequest {

    @NotNull(message = "Model Year cannot be null")
    @Size(min = 4, max = 4, message = "Model Year must be exactly 4 characters")
    @Pattern(regexp = "[0-9]+", message = "Model Year can only contain numeric characters")
    private int modelYear;

    @NotNull(message = "Model Name cannot be null")
    @Size(min = 1, max = 50, message = "Model Name length must be between 1 and 50 characters")
    @Pattern(regexp = "[a-zA-Z0-9\\s]+", message = "Model Name can only contain letters, numbers, and spaces")
    private String modelName;
}
