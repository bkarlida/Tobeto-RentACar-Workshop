package com.tobeto.spring.b.controllers;

import com.tobeto.spring.b.entities.Address;
import com.tobeto.spring.b.entities.Brand;
import com.tobeto.spring.b.repositories.BrandRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/brands")
public class BrandsController {
    private final BrandRepository brandRepository;
    public BrandsController(BrandRepository brandRepository)
    {
        this.brandRepository = brandRepository;
    }
    @GetMapping
    public List<Brand> getAll() {
        return brandRepository.findAll();
    }

    @GetMapping("{id}")
    public Brand getById(@PathVariable int id) {
        return brandRepository.findById(id).orElseThrow();
    }
    @PostMapping
    public void add(@RequestBody Brand brand) {
        brandRepository.save(brand);
    }

    @PutMapping("{id}")
    public Brand update(@RequestBody Brand newBrand,@PathVariable int id) {

        Optional<Brand> brand= brandRepository.findById(id);
        if (brand.isPresent()){
            Brand foundBrand=brand.get();
            foundBrand.setId(newBrand.getId());
            foundBrand.setName(newBrand.getName());
            brandRepository.save(foundBrand);
            return foundBrand;
        }
        else {
            return null;
        }
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {

        brandRepository.deleteById(id);
    }
}
