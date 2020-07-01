
/**
 * @Title: PostController.java
 * @Package com.example.jpa.controller
 * @Description: TODO(用一句话描述该文件做什么)
 * @author hemin
 * @date 2020年6月30日 下午9:54:42
 * @version V1.0
 */

package com.example.jpa.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.model.Post;
import com.example.jpa.service.PostService;

/**
 * @ClassName: PostController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author hemin
 * @date 2020年6月30日
 *
 */
@RestController
public class PostController {

	@Autowired
	private PostService postService;

    @GetMapping("/posts")
    public Page<Post> getAllPosts(Pageable pageable) {
        return postService.findAll(pageable);
    }

    @RequestMapping("/byId/{id}")
    public Post findById(@PathVariable Long id){
        return  postService.findById(id);
    }




}
