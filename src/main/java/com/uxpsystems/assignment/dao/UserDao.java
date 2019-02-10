package com.uxpsystems.assignment.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.uxpsystems.assignment.model.User;

@Transactional
@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public List<User> getAllUsers() {
		return this.hibernateTemplate.loadAll(User.class);
	}

	public User findUserById(long id) {
		User user = this.hibernateTemplate.get(User.class, id);
		if (user != null)
			return user;
		else
			return null;
	}

	public void saveUser(User user) {
		this.hibernateTemplate.persist(user);
	}

	public void updateUser(User user) {
		this.hibernateTemplate.update(user);
	}

	public void deleteUserById(User user) {
			this.hibernateTemplate.delete(user);
	}
}
