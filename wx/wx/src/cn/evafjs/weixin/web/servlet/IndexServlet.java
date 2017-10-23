package cn.evafjs.weixin.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.evafjs.user.domain.User;
import cn.evafjs.user.domain.UserInfo;
import cn.evafjs.user.service.UserInfoService;
import cn.evafjs.user.service.impl.UserInfoServiceImpl;
import cn.evafjs.weixin.domain.AccessToken;

public class IndexServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		UserInfoService userInfoService = new UserInfoServiceImpl();
		User user = (User)request.getSession().getAttribute("user");
		AccessToken accessToken = (AccessToken) this.getServletContext().getAttribute("AccessToken");
		UserInfo userInfo = userInfoService.findByOpenid(user.getOpenid(),accessToken.getAccess_token());
		request.setAttribute("userInfo", userInfo);
		request.getRequestDispatcher("/WEB-INF/mine.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
