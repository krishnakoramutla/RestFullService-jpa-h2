package com.app.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
