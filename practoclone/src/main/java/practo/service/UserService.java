package practo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practo.dao.UserDao;
import practo.model.Login;
import practo.model.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public int createUser(User user) {
		return this.userDao.saveUser(user);	
	}
	public User validateUser(Login login) {
		return this.userDao.validateUser(login);
	}
	

}
