package com.kiruthi.Service;

import java.util.List;

import com.kiruthi.model.User;

public interface UserService {

	public void addUser(User user);

	public User getUser(int id);

	public List<User> getAllUser();

	void updateUser(User user);

	public void deleteUser(int id);
}
