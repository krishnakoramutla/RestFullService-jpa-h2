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
import com.app.Exception.ResourceNotFoundException;
import com.app.Model.Posts;
import com.app.Model.User;
import com.app.Service.PostsService;
import com.app.Service.UserService;

@RestController
public class UserRestController {

	@Autowired
	private UserService service;

	@Autowired
	private PostsService pService;

	@GetMapping("/users")
	public List<User> getUsers() {
		return service.findAllUsers();
	}

	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable Long id) {
		User user = service.getUserById(id);
		if (user == null) {
			throw new ResourceNotFoundException("id-" + id);

		}
		return user;
	}

	@PostMapping("/users")
	public User addUser(@Valid @RequestBody User user) {

		return service.addUser(user);
	}

	@PutMapping("/users")
	public User updatUser(@RequestBody User user) {
		return service.updateUser(user);
	}

	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable Long id) {

		service.deleteUser(id);
	}

	@GetMapping("/users/{id}/posts")
	public List<Posts> getUserPosts(@PathVariable Long id) {

		User userOptional = service.getUserById(id);
		return userOptional.getPosts();

	}

	@PostMapping("/users/{id}/posts")
	public Posts createPosts(@PathVariable Long id, @RequestBody Posts posts) {
		User user = service.getUserById(id);

		posts.setUser(user);

		return pService.addPosts(posts);

	}

}
