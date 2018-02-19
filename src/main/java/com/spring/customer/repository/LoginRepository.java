package com.spring.customer.repository;

import com.spring.customer.model.data.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, Integer> {

}
