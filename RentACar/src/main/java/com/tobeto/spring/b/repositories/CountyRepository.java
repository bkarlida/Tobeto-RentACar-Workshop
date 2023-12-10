package com.tobeto.spring.b.repositories;

import com.tobeto.spring.b.entities.County;
import com.tobeto.spring.b.services.dtos.responses.county.GetCountyListResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountyRepository extends JpaRepository<County,Integer> {


//    @Query("SELECT new com.spring.rentACar.services.dtos.responses.county.GetCountyListResponse(c.name, " +
//            "new com.spring.rentACar.services.dtos.responses.city.GetCityListResponse(ci.name)) " +
//            "FROM County c INNER JOIN c.city ci ON c.id = ci.city.id")
//    List<GetCountyListResponse> getByIdQuery();




}

