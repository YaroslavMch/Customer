package com.spring.customer.repository;

import com.spring.customer.model.data.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
    List<Contact> findByCustomerId(@Param("customer_id") int id);
}
