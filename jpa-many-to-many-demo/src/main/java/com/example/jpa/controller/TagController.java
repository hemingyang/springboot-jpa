
    /**  
     * @Title: TagController.java
     * @Package com.example.jpa.controller
     * @Description: TODO(用一句话描述该文件做什么)
     * @author hemin
     * @date 2020年6月30日 下午9:55:03 
     * @version V1.0  
     */
    
package com.example.jpa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.jpa.model.Tag;
import com.example.jpa.service.TagService;

/**
     * @ClassName: TagController
     * @Description: TODO(这里用一句话描述这个类的作用)
     * @author hemin
     * @date 2020年6月30日
     *
     */
@RestController
@RequestMapping("/tag")
public class TagController {
	
	@Autowired
	
	private TagService tagService;
	
	
	@GetMapping("/findAll")
	public Page<Tag> findAll( Pageable pageable) {
		return tagService.findAll(pageable);
	}
	

}
