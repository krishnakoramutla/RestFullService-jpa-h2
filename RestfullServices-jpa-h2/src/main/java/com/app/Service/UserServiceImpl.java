package com.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dao.UserRepository;
import com.app.Model.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository repository;

	@Override
	public List<User> findAllUsers() {
		return repository.findAll();
	}

	@Override
	public User getUserById(Long id) {
		Optional<User> userOptional = repository.findById(id);
		User temUser = null;

		if (userOptional.isPresent()) {
			temUser = userOptional.get();
		}
		return temUser;
	}

	@Override
	public User addUser(User user) {

		return repository.save(user);
	}

	@Override
	public User updateUser(User user) {
		return repository.save(user);
	}

	@Override
	public void deleteUser(Long id) {
		repository.deleteById(id);
	}

}
