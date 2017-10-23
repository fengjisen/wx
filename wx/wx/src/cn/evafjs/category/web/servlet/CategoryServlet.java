package cn.evafjs.category.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.evafjs.category.domain.Category;
import cn.evafjs.category.service.CategoryService;
import cn.evafjs.category.service.impl.CategoryServiceImpl;
import cn.evafjs.web.servlet.BaseServlet;
import net.sf.json.JSONArray;

public class CategoryServlet extends BaseServlet {
	private CategoryService categoryService = new CategoryServiceImpl();

	public void findAllCategory(HttpServletRequest request, HttpServletResponse response) {
		List<Category> allCategory = categoryService.findAllCategory();
		JSONArray jsonArray = JSONArray.fromObject(allCategory);
		response.setContentType("text/html;charset=UTF-8");
		try {
			response.getWriter().write(jsonArray.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void findCategoryByCid(HttpServletRequest request, HttpServletResponse response) {
		String cid = request.getParameter("cid");
		Category category = categoryService.findCategoryByCid(cid);
		JSONArray jsonArray = JSONArray.fromObject(category);
		response.setContentType("text/html;charset=UTF-8");
		try {
			response.getWriter().write(jsonArray.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addCategory(HttpServletRequest request, HttpServletResponse response) {
		String cname = request.getParameter("cname");
		Category category = new Category();
		category.setCname(cname);
		categoryService.addCategory(category);
	}

	public void deleteCategoryByCid(HttpServletRequest request, HttpServletResponse response) {
		String cid = request.getParameter("cid");
		categoryService.deleteCategoryByCid(cid);
	}
	public void updateCategoryByCid(HttpServletRequest request, HttpServletResponse response) {
		String cid = request.getParameter("cid");
		String cname = request.getParameter("cname");
		Category category = new Category();
		category.setCid(Integer.getInteger(cid));
		category.setCname(cname);
		categoryService.updateCategory(category);
	}
	

}