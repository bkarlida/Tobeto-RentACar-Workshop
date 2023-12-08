package com.tobeto.spring.b.repositories;

import com.tobeto.spring.b.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//Generic yapılar
//Generic türler referans type olmak zorundadır
public interface BrandRepository extends JpaRepository<Brand, Integer> {
    List<Brand> findByName(String name);
    List<Brand> findByNameOrIdEquals(String name, int id);

}
