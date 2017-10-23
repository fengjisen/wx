package cn.evafjs.goods.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.evafjs.goods.domain.Goods;
import cn.evafjs.goods.service.GoodsService;
import cn.evafjs.goods.service.impl.GoodsServiceImpl;
import cn.evafjs.web.servlet.BaseServlet;
import net.sf.json.JSONArray;

public class GoodsServlet extends BaseServlet {
	private GoodsService goodsService = new GoodsServiceImpl();

	public void findAllGoods(HttpServletRequest request, HttpServletResponse response) {
		List<Goods> list = goodsService.findAllGoods();
		JSONArray jsonArray = JSONArray.fromObject(list);
		// 向jsp页面传json数据乱码
		response.setContentType("text/html;charset=UTF-8");
		try {
			response.getWriter().write(jsonArray.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 查找所有上架的商品
	public void findAllUpGoods(HttpServletRequest request, HttpServletResponse response) {
		List<Goods> list = goodsService.findAllUpGoods();
		JSONArray jsonArray = JSONArray.fromObject(list);
		// 向jsp页面传json数据乱码
		response.setContentType("text/html;charset=UTF-8");
		try {
			response.getWriter().write(jsonArray.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 查找所有下架的商品
	public void findAllUnderGoods(HttpServletRequest request, HttpServletResponse response) {
		List<Goods> list = goodsService.findAllUnderGoods();
		JSONArray jsonArray = JSONArray.fromObject(list);
		// 向jsp页面传json数据乱码
		response.setContentType("text/html;charset=UTF-8");
		try {
			response.getWriter().write(jsonArray.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void findGoodsByGid(HttpServletRequest request, HttpServletResponse response) {
		String gid = request.getParameter("gid");
		Goods goods = goodsService.findGoodsByGid(gid);
		JSONArray jsonArray = JSONArray.fromObject(goods);
		response.setContentType("text/html;charset=UTF-8");
		try {
			response.getWriter().write(jsonArray.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addGoods(HttpServletRequest request, HttpServletResponse response) {
		Goods goods = new Goods();
		goods.setGname(request.getParameter("gname"));
		goods.setGprice(Double.parseDouble(request.getParameter("gprice")));
		goods.setGinfo(request.getParameter("ginfo"));
		// 销量初始化为0
		goods.setGcount(0);
		goods.setCid(Integer.parseInt(request.getParameter("cid")));
		goods.setGname(request.getParameter("gimage"));
		goods.setGname(request.getParameter("gimage_min"));
	}

}
