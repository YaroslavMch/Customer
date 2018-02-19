package com.spring.customer.ManageApp;

import com.spring.customer.model.Customer;
import com.spring.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by YaroslaV on 18.02.2018.
 */
@RestController
@RequestMapping("/manage/customer")
public class UserController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public void saveCustomer(@RequestBody Customer customer){
        customerService.save(customer);
    }

    @PutMapping("/edit")
    public void  editCustomer(@RequestBody Customer customer){
        customerService.edit(customer);
    }

    @DeleteMapping("/delete")
    public void deleteCustomer(@RequestParam ("id") int id){
        customerService.delete(id);
    }

}
