package cn.evafjs.address.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.evafjs.address.dao.AddressDao;
import cn.evafjs.address.domain.Address;
import cn.evafjs.address.service.AddressService;
import cn.evafjs.address.service.impl.AddressServiceImpl;
import cn.evafjs.user.domain.User;
import cn.evafjs.web.servlet.BaseServlet;
import net.sf.json.JSONArray;

public class AddressServlet extends BaseServlet {
	private AddressService addressService = new AddressServiceImpl();
	public void getAddressListByUid(HttpServletRequest request, HttpServletResponse response) {
		
		User user = (User) request.getSession().getAttribute("user");
		int uid = user.getUid();
		List<Address> list = addressService.findAddrByUid(uid);
		JSONArray jsonArray = JSONArray.fromObject(list);
		//向jsp页面传json数据乱码
		response.setContentType("text/html;charset=UTF-8");
		try {
			response.getWriter().write(jsonArray.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		request.setAttribute("list", list);
//		request.getRequestDispatcher("/WEB-INF/address.jsp").forward(request, response);
	}
	
	public void findAddressByAid(HttpServletRequest request, HttpServletResponse response){
		String aid = request.getParameter("aid");
		Address address = addressService.findAddressByAid(aid);
		JSONArray jsonArray = JSONArray.fromObject(address);
		response.setContentType("text/html;charset=UTF-8");
		try {
			response.getWriter().write(jsonArray.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteAddressByAid(HttpServletRequest request, HttpServletResponse response){
		String aid = request.getParameter("aid");
		addressService.deleteAddressByAid(aid);
		
	}
	public void updateAddressByAid(HttpServletRequest request, HttpServletResponse response){
		String aid = request.getParameter("aid");
		Address address = addressService.findAddressByAid(aid);
		String aname = request.getParameter("aname");
		String asex = request.getParameter("asex");
		String aphone = request.getParameter("aphone");
		String area = request.getParameter("area");
		String addr = request.getParameter("addr");
		address.setAddr(addr);
		address.setAname(aname);
		address.setAphone(aphone);
		address.setArea(area);
		address.setAsex(Boolean.parseBoolean(asex));
		addressService.updateAddress(address);
		
	}
	public void addAddress(HttpServletRequest request, HttpServletResponse response){
		User user = (User) request.getSession().getAttribute("user");
		String aname = request.getParameter("aname");
		String asex = request.getParameter("asex");
		String aphone = request.getParameter("aphone");
		String area = request.getParameter("area");
		String addr = request.getParameter("addr");
		Address address = new Address();
		address.setAddr(addr);
		address.setAname(aname);
		address.setAphone(aphone);
		address.setArea(area);
		address.setAsex(Boolean.parseBoolean(asex));
		address.setUid(user.getUid());
		addressService.addAddress(address);
		
	}
	

}
