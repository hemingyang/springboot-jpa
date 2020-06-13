package com.example.demojpa.repository;

import com.example.demojpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * 继承jpa
 */
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
