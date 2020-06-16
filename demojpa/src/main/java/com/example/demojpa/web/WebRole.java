package com.example.demojpa.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demojpa.entity.Role;
import com.example.demojpa.repository.RoleRepository;

@RestController
@RequestMapping("/api/web")
public class WebRole {

	@Autowired
	private RoleRepository repository;
	
	@RequestMapping(value ="/findAllRole",method = RequestMethod.GET)
	public  List<Role> findAllRole () {
		
		return	repository.findAll();
	}
}
