package com.spring.customer.repository;

import com.spring.customer.model.data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByCustomerId(@Param("customer_id") int id);

}
