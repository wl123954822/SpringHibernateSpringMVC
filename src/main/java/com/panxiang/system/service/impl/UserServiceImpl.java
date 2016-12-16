package com.panxiang.system.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.panxiang.system.dao.UserDao;
import com.panxiang.system.entities.User;
import com.panxiang.system.service.UserService;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	@Override
	public User findById(long id) {
		return userDao.findById(id);
	}

	@Override
	public List<User> findByNameAndPwd(User user) {
		return userDao.findByNameAndPwd(user);
	}
}
