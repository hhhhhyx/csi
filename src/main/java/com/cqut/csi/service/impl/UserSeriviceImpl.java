package com.cqut.csi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqut.csi.dao.UserDao;
import com.cqut.csi.service.UserService;
import com.cqut.model.User;

@Service
public class UserSeriviceImpl implements UserService{
	@Autowired  
    private UserDao userDao; 
	
	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
        List<User> users = userDao.selectAllUsers();
        System.out.println(users.isEmpty());
		return users;
	}
}
