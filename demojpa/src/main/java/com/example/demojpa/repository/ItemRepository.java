package com.example.demojpa.repository;

import com.example.demojpa.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item ,Integer> {

}
