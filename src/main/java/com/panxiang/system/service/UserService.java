package com.panxiang.system.service;

import java.util.List;

import com.panxiang.system.entities.User;

public interface UserService {

	public User findById(long id);
	
	public List<User> findByNameAndPwd(User user);
}
