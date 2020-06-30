package com.example.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpa.model.Comment;
import com.example.jpa.repository.CommentRepository;

/**
     * @ClassName: CommentService
     * @Description: TODO(这里用一句话描述这个类的作用)
     * @author hemin
     * @date 2020年6月30日
     *
     */

@Service
public class CommentService {
	
	@Autowired
	private CommentRepository commentRepository;
	
	
	public List<Comment>listAll(){
		  
		return	commentRepository.findAll();
	};
	

}
