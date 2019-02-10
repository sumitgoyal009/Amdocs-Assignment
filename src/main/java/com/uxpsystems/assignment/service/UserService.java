package com.uxpsystems.assignment.service;

import java.util.List;

import com.uxpsystems.assignment.model.User;
/**
 * Apis to perform all the crud operation on user object
 * @author Sumit
 *
 */
public interface UserService {
	     
	    User findUserById(long id);
	     
	    void saveUser(User user);
	     
	    void updateUser(User user);
	     
	    void deleteUserById(User user);
	 
	    List<User> findAllUsers(); 
	     
	}
