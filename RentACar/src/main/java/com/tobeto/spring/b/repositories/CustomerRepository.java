package com.tobeto.spring.b.repositories;

import com.tobeto.spring.b.entities.Customer;
import com.tobeto.spring.b.services.dtos.responses.customer.GetEmailResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    List<Customer> findByEmail(String email);


    List<Customer> findByNameEndingWith(String name);
    List<Customer> findByNameStartingWith(String name);


    @Query("select c from Customer c  where c.age > :age")
    List<Customer> getByCustomerGreaterThanAge(int age);

    @Query("select c from Customer c  where c.name like :name%")
    List<Customer> getByCustomerStartName(String name);

}
