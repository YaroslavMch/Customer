package com.spring.customer.repository;

import com.spring.customer.model.data.Departament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartamentRepository extends JpaRepository<Departament, Integer> {
    List<Departament> findByCustomerId(@Param("customer_id") int id);
}
