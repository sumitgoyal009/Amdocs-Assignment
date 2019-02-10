package com.uxpsystems.assignment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uxpsystems.assignment.dao.UserDao;
import com.uxpsystems.assignment.model.User;
import com.uxpsystems.assignment.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	public List<User> findAllUsers() {
		return userDao.getAllUsers();
	}

	public User findUserById(long id) {
		return userDao.findUserById(id);
	}

	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	public void deleteUserById(User user) {
		userDao.deleteUserById(user);
	}

}
