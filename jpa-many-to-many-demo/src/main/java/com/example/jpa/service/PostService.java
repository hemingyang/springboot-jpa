
    /**  
     * @Title: PostService.java
     * @Package com.example.jpa.service
     * @Description: TODO(用一句话描述该文件做什么)
     * @author hemin
     * @date 2020年6月30日 下午9:55:49 
     * @version V1.0  
     */
    
package com.example.jpa.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpa.model.Post;
import com.example.jpa.repository.PostRepository;

/**
     * @ClassName: PostService
     * @Description: TODO(这里用一句话描述这个类的作用)
     * @author hemin
     * @date 2020年6月30日
     *
     */
@Transactional
@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;

	 public Page<Post> findAll(Pageable pageable){
		return postRepository.findAll(pageable);
		
	}
	
	
}
