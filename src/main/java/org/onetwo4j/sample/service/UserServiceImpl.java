package org.onetwo4j.sample.service;

import java.util.List;

import javax.annotation.Resource;

import org.onetwo4j.sample.dao.UserDao;
import org.onetwo4j.sample.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl {
	@Resource
	private UserDao userDao;
	
	public void batchInsert(List<User> users){
		userDao.batchInsert(users);
	}

}
