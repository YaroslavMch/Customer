package com.spring.customer.repository;

import com.spring.customer.model.data.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
