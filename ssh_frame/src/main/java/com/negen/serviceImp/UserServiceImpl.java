package com.negen.serviceImp;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.negen.dao.UserDao;
import com.negen.entity.User;
import com.negen.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource(name="userDao")
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public int saveUser(User user) {
		return userDao.saveUser(user);
	}

}
