package com.example.demojpa.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demojpa.entity.Role;
import com.example.demojpa.repository.RoleRepository;

@Service
public class RoleService {

	
	private Logger LOG = LoggerFactory.getLogger(RoleRepository.class);

    private RoleRepository repository;

    @Autowired
    public void setRole(RoleRepository repository) {
        this.repository = repository;
    }
    

	 public Role getRoleOne(Long id) {
	        LOG.info("Getting the Department with given id:" + id);
	        return repository.getOne(id);
	    }
	    
	    public List<Role> findAll(){
	    	
	    	return repository.findAll();
	    }


	
}
