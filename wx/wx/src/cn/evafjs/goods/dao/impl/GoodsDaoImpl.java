package cn.evafjs.goods.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.evafjs.goods.dao.GoodsDao;
import cn.evafjs.goods.domain.Goods;
import cn.evafjs.utils.DataSourceUtils;

public class GoodsDaoImpl implements GoodsDao {
	private QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
	@Override
	public List<Goods> findAllGoods() {
		String  sql ="select * from goods";
		List<Goods> list = null;
		try {
			qr.query(sql, new BeanListHandler<>(Goods.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public List<Goods> findAllUpGoods() {
		String  sql ="select * from goods where status= ?";
		List<Goods> list = null;
		try {
			qr.query(sql, new BeanListHandler<>(Goods.class),true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public List<Goods> findAllUnderGoods() {
		String  sql ="select * from goods where status= ?";
		List<Goods> list = null;
		try {
			qr.query(sql, new BeanListHandler<>(Goods.class),false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Goods findGoodsByGid(String gid) {
		String sql = "select * from goods where gid = ?";
		Goods goods = null;
		try {
			goods = qr.query(sql, new BeanHandler<>(Goods.class),gid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return goods;
	}

	@Override
	public void addGoods(Goods goods) {
		String sql = "insert into goods (gname,gprice,ginfo,gimage,gimage_min,gcount,status,cid) values(?,?,?,?,?,?,?,?)";
		try {
			qr.update(sql, goods.getGname(),goods.getGprice(),goods.getGinfo(),goods.getGimage(),goods.getGcount(),goods.getGimage_min(),goods.getStatus(),goods.getCid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteGoods(String gid) {
		String sql = "delete from goods where gid = ?";
		try {
			qr.update(sql, gid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateGoods(Goods goods) {
		String sql = "update goods set gname = ?,gprice=?,ginfo=?,gimage=?,gimage_min=?,gcount=?,status=?,cid=? where gid = ?";
		try {
			qr.update(sql, goods.getGname(),goods.getGprice(),goods.getGinfo(),goods.getGimage(),goods.getGimage_min(),goods.getGcount(),goods.getStatus(),goods.getCid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
