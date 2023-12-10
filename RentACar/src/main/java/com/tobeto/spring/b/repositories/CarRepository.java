package com.tobeto.spring.b.repositories;

import com.tobeto.spring.b.entities.Car;
import com.tobeto.spring.b.services.dtos.responses.car.GetCarListResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer>
{
    @Query("select c from Car  c where c.modelName LIKE %:name")
    List<Car> getModelName(String name);

    @Query("select new com.tobeto.spring.b.services.dtos.responses.car.GetCarListResponse(c.modelName, c.color, c.shiftType)" + "from Car  c where c.modelName LIKE %:name")
    List<GetCarListResponse> getModelName2(String name);


}
