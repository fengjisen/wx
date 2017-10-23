package cn.evafjs.user.service.impl;


import cn.evafjs.user.dao.UserDao;
import cn.evafjs.user.dao.impl.UserDaoImpl;
import cn.evafjs.user.domain.User;
import cn.evafjs.user.service.UserService;

public class UserServiceImpl implements UserService {
	UserDao userDao = new UserDaoImpl();
	public User findByOpenid(String openid) {
		User user = userDao.findByOpenid(openid);
		return user;
	}
	public void add(User user) {
		userDao.add(user);
	}
	public User getUserByOpenid(String openid){
		User user = new User();
		user.setOpenid(openid);
		return user;
	}

}
