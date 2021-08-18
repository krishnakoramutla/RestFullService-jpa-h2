package com.app.Service;

import java.util.List;

import com.app.Model.Posts;

public interface PostsService {

	public List<Posts> getPosts();

	public Posts getPostById(Long id);

	public Posts addPosts(Posts posts);

	public Posts updatePosts(Posts posts);

	public void deletePosts(Long id);

}
