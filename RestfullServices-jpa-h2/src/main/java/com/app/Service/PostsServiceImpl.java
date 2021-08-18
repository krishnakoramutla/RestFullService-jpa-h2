package com.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dao.PostsRepository;
import com.app.Model.Posts;

@Service
public class PostsServiceImpl implements PostsService {

	@Autowired
	private PostsRepository repository;

	@Override
	public List<Posts> getPosts() {
		return repository.findAll();
	}

	@Override
	public Posts getPostById(Long id) {
		Posts posts = repository.getById(id);
		if (posts == null) {
			return null;
		}
		return posts;
	}

	@Override
	public Posts addPosts(Posts posts) {

		return repository.save(posts);
	}

	@Override
	public Posts updatePosts(Posts posts) {
		return repository.save(posts);
	}

	@Override
	public void deletePosts(Long id) {
		repository.deleteById(id);

	}

}
