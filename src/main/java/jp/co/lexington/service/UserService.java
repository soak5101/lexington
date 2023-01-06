package jp.co.lexington.service;

import java.util.List;

import jp.co.lexington.domain.User;

/**
 * ユーザに関するサービス
 *
 */
public interface UserService {

	/**
	 * 
	 * @return
	 */
	public List<User> findUserAll();

}
