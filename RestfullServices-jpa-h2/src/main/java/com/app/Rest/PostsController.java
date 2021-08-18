package com.app.Rest;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.app.Model.Posts;
import com.app.Service.PostsService;

@RestController
public class PostsController {

	@Autowired
	private PostsService service;

	@GetMapping("/posts")
	public List<Posts> getPostss() {
		return service.getPosts();
	}

	@GetMapping("/posts/{id}")
	public Posts getPostsById(@PathVariable Long id) {
		return service.getPostById(id);
	}

	@PostMapping("/posts")
	public Posts addPosts(@Valid @RequestBody Posts user) {
		return service.addPosts(user);
	}

	@PutMapping("/posts")
	public Posts updatPosts(@RequestBody Posts user) {
		return service.updatePosts(user);
	}

	@DeleteMapping("/posts/{id}")
	public void deletePosts(@PathVariable Long id) {
		service.deletePosts(id);
	}

}
