package com.example.demojpa.repository;

import com.example.demojpa.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * 继承jpa
 */
public interface RoleRepository extends JpaRepository<Role,Long> {

}
