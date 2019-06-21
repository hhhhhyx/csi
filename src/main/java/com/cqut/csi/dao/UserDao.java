package com.cqut.csi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cqut.model.User;

@Mapper
public interface UserDao {

	public List<User> selectAllUsers();
}
