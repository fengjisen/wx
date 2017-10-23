package cn.evafjs.user.service.impl;

import java.io.UnsupportedEncodingException;

import cn.evafjs.constant.Constant;
import cn.evafjs.user.domain.UserInfo;
import cn.evafjs.user.service.UserInfoService;
import cn.evafjs.utils.WeixinUtil;
import net.sf.json.JSONObject;

public class UserInfoServiceImpl implements UserInfoService {

	

	@Override
	public UserInfo findByOpenid(String openid, String accessToken) throws UnsupportedEncodingException {
		String url = Constant.OPENID;
		url = url.replace("ACCESS_TOKEN",accessToken)
				.replace("OPENID", openid);
		String json1 = WeixinUtil.sendGet(url);
		String json = new String(json1.getBytes("iso-8859-1"),"utf-8");
		JSONObject jsonObject = JSONObject.fromObject(json);
		UserInfo userInfo = (UserInfo) JSONObject.toBean(jsonObject, UserInfo.class);
		return userInfo;
	}
	

}
