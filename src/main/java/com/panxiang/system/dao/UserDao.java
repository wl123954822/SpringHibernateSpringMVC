package com.panxiang.system.dao;

import java.util.List;

import com.panxiang.common.base.BaseDao;
import com.panxiang.system.entities.User;

public interface UserDao extends BaseDao<User> {

	public User findById(long id);
	public List<User> findByNameAndPwd(User user);
}
