package com.tobeto.spring.b.repositories;


import com.tobeto.spring.b.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// Generic
// Generic Typelar Reference Type olarak belirtilmelidir.
public interface BrandRepository extends JpaRepository<Brand, Integer>
{
    List<Brand> findAll();
}
