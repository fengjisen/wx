package cn.evafjs.user.service;

import cn.evafjs.user.domain.User;

public interface UserService {

	User findByOpenid(String openid);

	void add(User user);
	
	User getUserByOpenid(String openid);
}
