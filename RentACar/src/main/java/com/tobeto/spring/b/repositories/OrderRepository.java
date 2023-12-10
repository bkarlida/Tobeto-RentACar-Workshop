package com.tobeto.spring.b.repositories;

import com.tobeto.spring.b.entities.Order;
import com.tobeto.spring.b.services.dtos.responses.car.GetCarListResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public interface OrderRepository extends JpaRepository<Order,Integer> {
    List<Order> findByStartDateBetween(LocalDate startDate, LocalDate startDate2);


}
