package com.app.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Model.Posts;

public interface PostsRepository extends JpaRepository<Posts, Long> {

}
