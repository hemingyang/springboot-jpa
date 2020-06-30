 package com.example.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpa.model.Post;
import com.example.jpa.repository.PostRepository;

/**
     * @ClassName: PostService
     * @Description: TODO(这里用一句话描述这个类的作用)
     * @author hemin
     * @date 2020年6月30日
     *
     */
@Service
public class PostService {

	
	@Autowired
	private PostRepository postRepository;
	
	
	public List<Post> findAll(){
		
		return postRepository.findAll();
	}
}

