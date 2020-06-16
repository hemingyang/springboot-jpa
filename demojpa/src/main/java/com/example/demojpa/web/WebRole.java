package com.example.demojpa.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demojpa.entity.Role;
import com.example.demojpa.service.RoleService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api/role")
@Api(value = "/api/role", tags = "/api/role")
public class WebRole {

	@Autowired
	private RoleService repository;
	
	@RequestMapping(value ="/findAllRole",method = RequestMethod.GET)
	public  List<Role> findAllRole () {
		
		return	repository.findAll();
	}
	
	@RequestMapping(value = "/findOneRole/{id}" ,method =RequestMethod.GET)
	public Role findRoleOne( @PathVariable Long id) {
		
		return repository.getRoleOne(id);
	}
}
