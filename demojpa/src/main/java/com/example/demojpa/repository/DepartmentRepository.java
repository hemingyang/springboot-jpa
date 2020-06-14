package com.example.demojpa.repository;

import com.example.demojpa.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 继承jpa
 */
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
