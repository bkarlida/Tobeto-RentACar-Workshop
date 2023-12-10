package com.tobeto.spring.b.repositories;

import com.tobeto.spring.b.entities.Brand;
import com.tobeto.spring.b.services.dtos.responses.brand.GetBrandListResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//Generic yapılar
//Generic türler referans type olmak zorundadır
public interface BrandRepository extends JpaRepository<Brand, Integer> {
    List<Brand> findByName(String name);
   // List<Brand> findByFirstNameLike(String name);

    List<Brand> findByNameOrIdEquals(String name, int id);

    @Query("SELECT b FROM Brand b")
    List<Brand> search();



}
