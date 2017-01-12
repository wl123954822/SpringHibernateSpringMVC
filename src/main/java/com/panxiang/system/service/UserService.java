package com.panxiang.system.service;

import java.util.List;

import com.panxiang.system.entities.User;

public interface UserService {

	User findById(long id);
	
	List<User> findByNameAndPwd(User user);
}
