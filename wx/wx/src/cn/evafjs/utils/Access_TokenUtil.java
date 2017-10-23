package cn.evafjs.utils;

import cn.evafjs.constant.Constant;
import cn.evafjs.weixin.domain.Access_Token;
import net.sf.json.JSONObject;

public class Access_TokenUtil {
	public static String getOpenid(String code){
		String url = Constant.ACCESS_TOKEN;
		url = url.replace("APPID", Constant.APPID)
				.replace("SECRET",Constant.APPSECRET)
				.replace("CODE", code);
		String json = WeixinUtil.sendGet(url);
		JSONObject jsonObject=JSONObject.fromObject(json);
		Access_Token at = (Access_Token) JSONObject.toBean(jsonObject, Access_Token.class);
		return at.getOpenid();
	}
}
