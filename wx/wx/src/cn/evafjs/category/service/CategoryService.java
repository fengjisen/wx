package cn.evafjs.category.service;

import java.util.List;

import cn.evafjs.category.domain.Category;

public interface CategoryService {
	void addCategory(Category category);
	void deleteCategoryByCid(String cid);
	void updateCategory(Category category);
	Category findCategoryByCid(String cid);
	List<Category> findAllCategory();
}
