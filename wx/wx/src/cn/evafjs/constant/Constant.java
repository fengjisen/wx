package cn.evafjs.constant;

public class Constant {
	public static final String TOKEN = "evafjs";
	public static final String APPSECRET = "a00df2d9ba88a32040b2d681c6c812fc";
	public static final String APPID = "wx609a9e14dd73b9a0";
	public static final String AUTH_URL = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=SCOPE&state=STATE#wechat_redirect";
	public static final String ACCESS_TOKEN = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";
	public static final String OPENID = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";
}
