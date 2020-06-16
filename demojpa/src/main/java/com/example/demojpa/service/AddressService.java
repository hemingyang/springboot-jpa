package com.example.demojpa.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demojpa.entity.Address;
import com.example.demojpa.repository.AddressRepository;

@Service
public class AddressService {

	
	private Logger LOG = LoggerFactory.getLogger(AddressRepository.class);

    private AddressRepository addressRepository;

    @Autowired
    public void setAddress(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

	  public Address getAddressone(Long id) {
	        LOG.info("Getting the Address with given id:" + id);
	        return addressRepository.getOne(id);
	    }
	    
	    public List<Address> findAll(){
	    	
	    	return addressRepository.findAll();
	    }
	
    
}
