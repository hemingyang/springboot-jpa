package com.example.demojpa.repository;

import com.example.demojpa.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * 继承jpa
 */
public interface DepartmentRepository extends JpaRepository<Department,Long> {


   // @Query("SELECT  dep FROM  Department  dep where dep.name in (select *from Employee  em where  em.department_id)" )
    public String  finddepName(String name);
}
