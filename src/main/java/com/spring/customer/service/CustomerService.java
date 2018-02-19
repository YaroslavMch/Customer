package com.spring.customer.service;

import com.spring.customer.model.Customer;
import com.spring.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by YaroslaV on 18.02.2018.
 */
@Service
@Transactional
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void save(Customer customer){
            customerRepository.save(customer);
    }

    public void edit(Customer customer){
            customerRepository.save(customer);
    }
    public void delete(int id){
            customerRepository.delete(id);
    }
}
