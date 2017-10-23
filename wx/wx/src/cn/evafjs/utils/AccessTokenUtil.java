package cn.evafjs.utils;

import cn.evafjs.weixin.domain.AccessToken;
import net.sf.json.JSONObject;

public class AccessTokenUtil {
	public static AccessToken getAccessToken(String appID, String appScret) {
		String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=" + appID + "&secret="
				+ appScret;
		String at = WeixinUtil.sendGet(url);

		JSONObject jsonObject=JSONObject.fromObject(at);
		AccessToken accessToken = (AccessToken)JSONObject.toBean(jsonObject, AccessToken.class);
		
		return accessToken;
	}
}
