package com.example.demojpa.web;


import com.example.demojpa.entity.*;
import com.example.demojpa.repository.AddressRepository;
import com.example.demojpa.repository.DepartmentRepository;
import com.example.demojpa.repository.EmployeeRepository;
import com.example.demojpa.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*

 */
@RestController
@RequestMapping("/web")
public class WebAddress {


    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private EmployeeRepository employeeRepository;



    @RequestMapping(value = "/addressAll",method = RequestMethod.GET )
    public List<Address> addressAll(){

        return  addressRepository.findAll();
    }


    @RequestMapping(value = "/departmentAll",method = RequestMethod.GET)
    public List<Department> departmentAll(){

        return  departmentRepository.findAll();
    }


    @RequestMapping(value = "/roletAll",method = RequestMethod.GET )
    public List<Role> roletAll(){

        return  roleRepository.findAll();
    }

    @RequestMapping(value = "/employeeAll",method = RequestMethod.GET )
    public List<Employee> employeeAll(){

        return  employeeRepository.findAll();
    }



    @RequestMapping(value = "/add",method = RequestMethod.POST ,produces = "application/json; charset=utf-8")
    public Address addAddress(@RequestBody Address address) {

        return addressRepository.save(address);
    }


    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public Address updateAddress(@RequestBody Address address, @PathVariable long id) {
        address.setId(id);
        return addressRepository.saveAndFlush(address);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteAddress(@PathVariable Long id) {
       //强制类型转换
         Integer ids= id.intValue();
        addressRepository.deleteById(ids);
    }

}
