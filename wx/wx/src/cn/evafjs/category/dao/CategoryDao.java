package cn.evafjs.category.dao;

import java.util.List;

import cn.evafjs.category.domain.Category;

public interface CategoryDao {

	void addCategory(Category category);

	void deleteCategory(String cid);

	Category findCategoryByCid(String cid);

	List<Category> findAllCategory();

	void updateCategory(Category cate);

}
