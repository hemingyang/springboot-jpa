package com.example.demojpa.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demojpa.entity.Department;
import com.example.demojpa.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	 private Logger LOG = LoggerFactory.getLogger(DepartmentRepository.class);
	@Autowired
	private DepartmentRepository departmentRepository;
	
	
	public void getDepartment(DepartmentRepository departmentRepository) {
		this.departmentRepository=departmentRepository;
	}

	
	 public Department getDepartment(Long id) {
	        LOG.info("Getting the Department with given id:" + id);
	        return departmentRepository.getOne(id);
	    }
	    
	    public List<Department> findAll(){
	    	
	    	return departmentRepository.findAll();
	    }
}
