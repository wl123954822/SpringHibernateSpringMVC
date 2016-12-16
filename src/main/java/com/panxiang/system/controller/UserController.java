package com.panxiang.system.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.panxiang.system.entities.User;
import com.panxiang.system.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("getuser")
	@ResponseBody
	public User getUser(User user){
		User users = userService.findById(user.getId());
		return users;
	}
	
	@RequestMapping("login")
	@ResponseBody
	public Map<String, Object> login(User user){
		Map<String, Object> map = new HashMap<String, Object>();
		List<User> users = userService.findByNameAndPwd(user);
		if (users.size()>0) {
			map.put("status", "success");
			map.put("text", users);
		}else {
			map.put("status", "failure");
			map.put("text", "失败啦...");
		}
		return map;
	}
	
}
