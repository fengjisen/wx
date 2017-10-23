package cn.evafjs.weixin.web.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import cn.evafjs.constant.Constant;
import cn.evafjs.utils.AccessTokenUtil;
import cn.evafjs.weixin.domain.AccessToken;

public class AccessTokenServlet extends HttpServlet {
	public static AccessToken access_token = null;
	private ServletContext servletContext = null;

	public void init() throws ServletException {
		super.init();
		new Thread(new AccessTokenThread()).start();
	}

	class AccessTokenThread implements Runnable {

		@Override
		public void run() {
			while (true) {
				try {

					access_token = AccessTokenUtil.getAccessToken(Constant.APPID, Constant.APPSECRET);
					if (AccessTokenServlet.this.servletContext == null) {
						AccessTokenServlet.this.servletContext = AccessTokenServlet.this.getServletContext();
					}
					servletContext.setAttribute("AccessToken", access_token);
					if (null != access_token) {
						System.out.println("accessToken" + access_token.getExpires_in());

						Thread.sleep((access_token.getExpires_in() - 200) * 1000);
					} else {

						Thread.sleep(60 * 1000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}

	}

}
