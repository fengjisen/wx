package cn.evafjs.user.service;

import java.io.UnsupportedEncodingException;

import cn.evafjs.user.domain.UserInfo;

public interface UserInfoService {

	UserInfo findByOpenid(String openid, String accessToken) throws UnsupportedEncodingException;

}
