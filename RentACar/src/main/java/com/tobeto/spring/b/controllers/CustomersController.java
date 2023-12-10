package com.tobeto.spring.b.controllers;

import com.tobeto.spring.b.services.abstracts.CustomerService;
import com.tobeto.spring.b.services.dtos.requests.customer.AddCustomerRequest;
import com.tobeto.spring.b.services.dtos.requests.customer.UpdateCustomerRequest;
import com.tobeto.spring.b.services.dtos.responses.customer.GetCustomerResponse;
import com.tobeto.spring.b.services.dtos.responses.customer.GetListCustomerResponse;
import com.tobeto.spring.b.entities.Customer;
import com.tobeto.spring.b.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/customer")
@AllArgsConstructor
public class CustomersController {
    public final CustomerService customerService;

    @GetMapping
    public List<GetListCustomerResponse> getAll(){
        return customerService.getAll();
    }
    @GetMapping("{id}")
    public GetCustomerResponse getById(@PathVariable int id){
        return customerService.getById(id);
    }
    @PostMapping
    public void add(@RequestBody AddCustomerRequest addCustomerRequest){
        customerService.add(addCustomerRequest);
    }
    @PutMapping("{id}")
    public void update(@RequestBody UpdateCustomerRequest updateCustomerRequest, @PathVariable int id){
        customerService.update(updateCustomerRequest,id);

    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        customerService.delete(id);
    }

    @GetMapping("EndnameDerived")
    public List<Customer> GetByNameEndingWith(@RequestParam String name)
    {
        return this.customerService.GetByNameEndingWith(name);
    }
    @GetMapping("firstnameDerived")
    public List<Customer> GetByNameStartingWith(@RequestParam String name)
    {
        return this.customerService.GetByNameStartingWith(name);
    }
    @GetMapping("Email")
    public List<Customer> getByEmail(@RequestParam String  name)
    {
        return this.customerService.GetByEmail(name);
    }
    @GetMapping("age")
    public List<Customer> getByCustomerGreaterThanAge(@RequestParam int age)
    {
        return this.customerService.getByCustomerGreaterThanAge(age);
    }
    @GetMapping("startname")
    public List<Customer> getByCustomerStartName(@RequestParam String name)
    {
        return this.customerService.getByCustomerStartName(name);
    }
}