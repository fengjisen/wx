package cn.evafjs.user.dao;

import cn.evafjs.user.domain.User;

public interface UserDao {

	User findByOpenid(String openid);

	void add(User user);

}
