package com.example.demojpa.repository;

import com.example.demojpa.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 继承jpa
 */
public interface AddressRepository extends JpaRepository<Address,Integer> {


}
