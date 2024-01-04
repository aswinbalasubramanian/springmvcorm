package com.aswin.spring.springmvcorm.user.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aswin.spring.springmvcorm.user.entity.User;
import com.aswin.spring.springmvcorm.user.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public int create(User user) {
		Integer result = (Integer)hibernateTemplate.save(user);
		return result;
	}

}