package com.tobeto.spring.b.services.abstracts;

import com.tobeto.spring.b.entities.Customer;
import com.tobeto.spring.b.services.dtos.requests.address.UpdateAddressRequest;
import com.tobeto.spring.b.services.dtos.requests.customer.AddCustomerRequest;
import com.tobeto.spring.b.services.dtos.requests.customer.UpdateCustomerRequest;
import com.tobeto.spring.b.services.dtos.responses.customer.GetCustomerResponse;
import com.tobeto.spring.b.services.dtos.responses.customer.GetEmailResponse;
import com.tobeto.spring.b.services.dtos.responses.customer.GetListCustomerResponse;

import java.util.List;

public interface CustomerService {
    List<GetListCustomerResponse> getAll();
    GetCustomerResponse getById(int id);
    void add(AddCustomerRequest addCustomerRequest);
    void update(UpdateCustomerRequest updateCustomerRequest, int id);
    void delete(int id);
   List<Customer> GetByEmail(String email);
   List<Customer> GetByNameEndingWith(String name);
   List<Customer> GetByNameStartingWith(String name);
   List<Customer> getByCustomerGreaterThanAge(int age);
    List<Customer> getByCustomerStartName(String name);

}
