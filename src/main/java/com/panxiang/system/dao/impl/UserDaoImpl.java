package com.panxiang.system.dao.impl;

import com.panxiang.common.base.impl.BaseDaoHibernate4;
import com.panxiang.system.dao.UserDao;
import com.panxiang.system.entities.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoHibernate4<User> implements UserDao {

	@Override
	public User findById(long id) {
		return this.get(User.class, id);
	}

	@Override
	public List<User> findByNameAndPwd(User user) {
		String hql = "FROM User u WHERE u.name=?0 AND u.pwd=?1";
		return this.find(hql, user.getName(), user.getPwd());
	}

}
