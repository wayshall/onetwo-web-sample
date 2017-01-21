package org.onetwo4j.sample.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.onetwo4j.sample.model.User;
import org.onetwo4j.sample.service.UserServiceImpl;
import org.onetwo4j.sample.utils.WebConstants;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(WebConstants.BASE_PATH+"/user")
public class UserController {

	@Resource
	private UserServiceImpl userService;
	
	@RequestMapping(value="/view/{id}", method=RequestMethod.GET)
	public Object view(@PathVariable("id")Long id){
		User user = User.findById(id);
		return user;
	}

	@RequestMapping(value="batchInsert", method=RequestMethod.GET)
	public Object batchInser(int count){
		List<User> users = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			User user = new User();
			user.setUserName("test-username-"+i);
			user.setPassword("123456");
			users.add(user);
		}
		userService.batchInsert(users);
		return users;
	}

}
