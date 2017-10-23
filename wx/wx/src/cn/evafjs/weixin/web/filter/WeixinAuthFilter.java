package cn.evafjs.weixin.web.filter;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.evafjs.constant.Constant;
import cn.evafjs.user.domain.User;
import cn.evafjs.user.service.UserService;
import cn.evafjs.user.service.impl.UserServiceImpl;
import cn.evafjs.utils.Access_TokenUtil;

public class WeixinAuthFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		User tu = (User) req.getSession().getAttribute("user");
		if (tu == null) {
			String agent = req.getHeader("User-Agent");
			if (agent != null && agent.toLowerCase().indexOf("micromessenger") >= 0) {
				String code = request.getParameter("code");
				String state = request.getParameter("state");
				if (code != null && state != null && state.equals("1")) {
					String openid = Access_TokenUtil.getOpenid(code);
					if (openid != null) {
						UserService userService = new UserServiceImpl();
						User u = userService.findByOpenid(openid);
						if (u == null) {
							u = userService.getUserByOpenid(openid);
							userService.add(u);

						}
						req.getSession().setAttribute("user", u);
					}
				} else {
					String path = req.getRequestURL().toString();
					String query = req.getQueryString();
					if (query != null) {
						path = path + "?" + query;
					}
					String url = Constant.AUTH_URL;
					url = url.replace("APPID", Constant.APPID).replace("REDIRECT_URI", URLEncoder.encode(path, "UTF-8"))
							.replace("SCOPE", "snsapi_base").replace("STATE", "1");
					resp.sendRedirect(url);
					return;
				}
			}

		}
		chain.doFilter(req, resp);

	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
