package com.app.Service;

import java.util.List;
import com.app.Model.User;

public interface UserService {
	public List<User> findAllUsers();

	public User getUserById(Long id);

	public User addUser(User user);

	public User updateUser(User user);

	public void deleteUser(Long id);

}
