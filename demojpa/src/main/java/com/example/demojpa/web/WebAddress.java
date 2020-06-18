package com.example.demojpa.web;


import com.example.demojpa.entity.*;
import com.example.demojpa.repository.AddressRepository;
import com.example.demojpa.repository.DepartmentRepository;
import com.example.demojpa.repository.EmployeeRepository;
import com.example.demojpa.repository.RoleRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*
 * 
     * @ClassName: WebAddress
     * @Description: TODO(这里用一句话描述这个类的作用)
     * @author hemin
     * @date 2020年6月18日
     *
 */
@RestController
@RequestMapping("/api/address")
@Api(value = "/api/address", tags = "/api/address")
public class WebAddress {


    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private EmployeeRepository employeeRepository;


    @ApiOperation(value = "addressAll",notes = "addressAll")
    @RequestMapping(value = "/addressAll",method = RequestMethod.GET )
    public List<Address> addressAll(){

        return  addressRepository.findAll();
    }
    
    @ApiOperation(value = "addresone",notes = "addresone")
    @RequestMapping(value = "/addresone/{id}",method = RequestMethod.GET )
    public Address addressone(@PathVariable Long id){

        return  addressRepository.getOne(id);
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
        addressRepository.deleteById(id);
    }

}
