package com.cqut.csi.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import com.cqut.model.User;

public interface UserService {
	List<User> findAllUsers();
}
