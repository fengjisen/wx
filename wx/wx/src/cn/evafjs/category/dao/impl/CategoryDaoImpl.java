package cn.evafjs.category.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.evafjs.category.dao.CategoryDao;
import cn.evafjs.category.domain.Category;
import cn.evafjs.utils.DataSourceUtils;

public class CategoryDaoImpl implements CategoryDao {
	QueryRunner qr= new QueryRunner(DataSourceUtils.getDataSource());
	@Override
	public void addCategory(Category category) {
		String sql = "insert into category(cname) values(?)";
		try {
			qr.update(sql, category.getCname());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteCategory(String cid) {
		String sql = "delete from category where cid = ?";
		try {
			qr.update(sql, cid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Category findCategoryByCid(String cid) {
		String sql = "select * from category where cid = ?";
		Category category = null;
		try {
			category = qr.query(sql, new BeanHandler<>(Category.class), cid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return category;
	}

	@Override
	public List<Category> findAllCategory() {
		String sql = "select * from category";
		List<Category> list = null;
		try {
			list= qr.query(sql, new BeanListHandler<>(Category.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}

	@Override
	public void updateCategory(Category cate) {
		String sql = "update category set cname = ? where cid = ?";
		try {
			qr.update(sql, cate.getCname(),cate.getCid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
