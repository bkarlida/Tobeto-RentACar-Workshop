package com.tobeto.spring.b.services.dtos.requests.brand;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddBrandRequest {

    //@NotBlank(message = "boş bırakılamaz")
   // @Size(min = 3, max = 30, message = "3 ile 30 arasında karaktere sahip olmalıdır")
    private String name;
}
