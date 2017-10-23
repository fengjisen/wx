package cn.evafjs.weixin.web.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.evafjs.constant.Constant;
import cn.evafjs.utils.SecurityUtil;


public class WeixinBasicServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String signature = request.getParameter("signature");
		String timestamp = request.getParameter("timestamp");
		String nonce = request.getParameter("nonce");
		String echostr = request.getParameter("echostr");
		String[] arrs = {Constant.TOKEN,nonce,timestamp};
		Arrays.sort(arrs);
		StringBuffer sb = new StringBuffer();
		for(String a:arrs) {
			sb.append(a);
		}
		String sha1 = SecurityUtil.sha1(sb.toString());
		if(sha1.equals(signature)) {
			response.getWriter().println(echostr);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
