package cn.evafjs.user.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;

import cn.evafjs.user.dao.UserDao;
import cn.evafjs.user.domain.User;
import cn.evafjs.utils.DataSourceUtils;

public class UserDaoImpl implements UserDao {

	public User findByOpenid(String openid) {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from user where openid = ?";
		try {
			return qr.query(sql, new BeanHandler<>(User.class),openid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("aaa");
			e.printStackTrace();
		}
		return null;
	}

	public void add(User user) {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "insert into user(openid) values(?)";
		try {
			qr.update(sql, user.getOpenid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
