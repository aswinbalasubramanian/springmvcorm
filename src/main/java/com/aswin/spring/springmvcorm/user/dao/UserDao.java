package com.aswin.spring.springmvcorm.user.dao;

import java.util.List;

import com.aswin.spring.springmvcorm.user.entity.User;

public interface UserDao {
	int create(User user);
	List<User> findUsers();
}
