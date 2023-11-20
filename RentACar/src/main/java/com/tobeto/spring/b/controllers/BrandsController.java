package com.tobeto.spring.b.controllers;

import com.tobeto.spring.b.entities.Brand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("api/brands")
public class BrandsController {
    // final => sadece ctor'da ilgili değerin ataması yapılabileceğini söyler.
    private final com.tobeto.spring.b.repositories.BrandRepository brandRepository;
    public BrandsController(com.tobeto.spring.b.repositories.BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }
    // Dependency Injection
    // Spring IoC => DI Container
    @GetMapping
    public List<Brand> getAll() {
        // findAll => hazır bir JPArepository fonk.
        List<Brand> brands = brandRepository.findAll();
        return brands;
    }
}
// http://localhost:8080/api/brands GET