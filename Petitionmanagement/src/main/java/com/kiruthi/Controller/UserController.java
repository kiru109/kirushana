package com.kiruthi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiruthi.ServiceImpl.UserServiceImpl;
import com.kiruthi.model.User;

@RestController
@RequestMapping("/User")
@CrossOrigin("*")

public class UserController {

	@Autowired
	UserServiceImpl service;

	@PostMapping
	public String insertUser(@RequestBody User user) {
		String msg = "";
		try {
			service.addUser(user);
			msg = "Success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;
	}

	@GetMapping("{id}")
	public User getUserById(@PathVariable("id") int id) {
		return service.getUser(id);
	}

	@GetMapping("/all")
	public List<User> getUser() {
		return service.getAllUser();
	}

	@PutMapping
	public String updateUser(@RequestBody User user) {
		String msg = "";
		try {
			service.updateUser(user);
			msg = "Success";
		} catch (Exception s) {
			s.printStackTrace();
			msg = "failure";
		}
		return msg;
	}

	@DeleteMapping("{id}")
	public String deleteUser(@PathVariable("id") int id) {
		String msg = "";
		try {
			service.deleteUser(id);
			msg = "Success";
		} catch (Exception s) {
			s.printStackTrace();
			msg = "failure";
		}
		return msg;
	}
}
