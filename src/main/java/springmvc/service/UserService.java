package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDao;
import springmvc.model.User;

@Service

/*
 * Automatically identify that this is Service layer class we don't need to
 * configure this in xml. We just need Service annotation(@Service).
 */
public class UserService {

	@Autowired
	private UserDao userDao;

	public int createUser(User user) {
		return this.userDao.saveUser(user);
	}

}
