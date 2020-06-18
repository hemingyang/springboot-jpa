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
/**
 * 
     * @ClassName: WebRole
     * @Description: TODO(这里用一句话描述这个类的作用)
     * @author hemin
     * @date 2020年6月18日
     *
 */
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
	
	/**
	 * 
	     * @Title: test
	     * @Description: TODO(这里用一句话描述这个方法的作用)
	     * @param @return 参数
	     * @return String 返回类型
	     * @throws
	 */
	public String test () {
		return null;
		
	}
}
