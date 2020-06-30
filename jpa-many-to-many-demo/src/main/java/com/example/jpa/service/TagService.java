
    /**  
     * @Title: TagService.java
     * @Package com.example.jpa.service
     * @Description: TODO(用一句话描述该文件做什么)
     * @author hemin
     * @date 2020年6月30日 下午9:56:03 
     * @version V1.0  
     */
    
package com.example.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpa.model.Post;
import com.example.jpa.model.Tag;
import com.example.jpa.repository.TagRepository;

/**
     * @ClassName: TagService
     * @Description: TODO(这里用一句话描述这个类的作用)
     * @author hemin
     * @date 2020年6月30日
     *
     */
//事务一般不建议放在类上  
@Transactional  
@Service
public class TagService {
	
	
	
	@Autowired
	private TagRepository tagRepository;
	
	
	public Page<Tag> findAll(Pageable pageable){
		return tagRepository.findAll(pageable);
		
	}
}
