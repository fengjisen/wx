package cn.evafjs.category.service.impl;

import java.util.List;

import cn.evafjs.category.dao.CategoryDao;
import cn.evafjs.category.dao.impl.CategoryDaoImpl;
import cn.evafjs.category.domain.Category;
import cn.evafjs.category.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
	private CategoryDao categoryDao = new CategoryDaoImpl();
	@Override
	public void addCategory(Category category) {
		categoryDao.addCategory(category);
	}

	@Override
	public void deleteCategoryByCid(String cid) {
		categoryDao.deleteCategory(cid);
	}

	@Override
	public void updateCategory(Category category) {
		Category cate = categoryDao.findCategoryByCid(category.getCid().toString());
		cate.setCname(category.getCname());
		categoryDao.updateCategory(cate);
	}

	@Override
	public Category findCategoryByCid(String cid) {
		Category category = categoryDao.findCategoryByCid(cid);
		return category;
	}

	@Override
	public List<Category> findAllCategory() {
		List<Category> list = categoryDao.findAllCategory();
		return list;
	}

}
