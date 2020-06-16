package com.example.demojpa.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demojpa.entity.Employee;
import com.example.demojpa.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	
	private Logger LOG = LoggerFactory.getLogger(EmployeeRepository.class);

    private EmployeeRepository employeeRepository;

    @Autowired
    public void setEmployee(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    
    public Employee getEmployee(Long id) {
        LOG.info("Getting the Employee with given id:" + id);
        return employeeRepository.getOne(id);
    }
    
    public List<Employee> findAll(){
    	
    	return employeeRepository.findAll();
    }
}
