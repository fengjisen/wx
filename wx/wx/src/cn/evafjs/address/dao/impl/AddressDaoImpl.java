package cn.evafjs.address.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.evafjs.address.dao.AddressDao;
import cn.evafjs.address.domain.Address;
import cn.evafjs.utils.DataSourceUtils;

public class AddressDaoImpl implements AddressDao {

	@Override
	public List<Address> findAddrByUid(int uid) {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from address where uid = ? and status = ?";
		List<Address> list = null;
		try {
			list = qr.query(sql, new BeanListHandler<>(Address.class), uid,"ture");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Address findAddressByAid(String aid) {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from address where aid = ? and status = ?" ;
		Address address = null;
		try {
			qr.query(sql, new BeanHandler<>(Address.class), aid,"true");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return address;
		
	}

	@Override
	public void updateAddress(Address address) {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "update address set aname = ?,asex=?,aphone=?,area=?,addr=?,status=? where aid = ?";
		try {
			qr.update(sql, address.getAname(),address.getAsex(),address.getAphone(),address.getArea(),address.getAddr(),address.getStatus(),address.getAid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void addAddress(Address address) {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "insert into address(aname,asex,aphone,area,addr,status,uid) values(?,?,?,?,?,?,?)";
		try {
			qr.update(sql, address.getAname(),address.getAsex(),address.getAphone(),address.getArea(),address.getAddr(),address.getStatus(),address.getUid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
