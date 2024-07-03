package com.kiruthi.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiruthi.Repository.UserRepo;
import com.kiruthi.Service.UserService;
import com.kiruthi.model.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepo repo;

	@Override
	public void addUser(User user) {
		repo.save(user);
	}

	@Override
	public User getUser(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<User> getAllUser() {
		return repo.findAll();
	}

	@Override
	public void updateUser(User user) {

		repo.save(user);
	}

	public void deleteUser(int id) {
		repo.deleteById(id);
	}

}
