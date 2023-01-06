package jp.co.lexington.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import jp.co.lexington.domain.User;
import jp.co.lexington.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public List<User> findUserAll() {
		User user = new User();
		user.setId(1L);
		user.setEmail("hoge@hoge");
		user.setName("hoge");
		return List.of(user);
	}

}
