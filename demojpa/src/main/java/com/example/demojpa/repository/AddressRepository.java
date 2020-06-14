package com.example.demojpa.repository;

import com.example.demojpa.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 继承jpa
 */
public interface AddressRepository extends JpaRepository<Address,Long> {
        //自定义查询
    @Query("SELECT ad FROM  Address  ad WHERE ad.city  like  %?027%")
    public List<Address> findbyName(String ctiy);


}
