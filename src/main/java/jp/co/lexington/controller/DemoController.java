package jp.co.lexington.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.co.lexington.domain.User;
import jp.co.lexington.service.UserService;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public List<User> getUsers() {
		return userService.findUserAll();
	}

}
