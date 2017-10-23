package cn.evafjs.user.domain;

import java.io.Serializable;

public class User implements Serializable{
	private Integer uid;
	private String openid;
	private String default_aid;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getDefault_aid() {
		return default_aid;
	}
	public void setDefault_aid(String default_aid) {
		this.default_aid = default_aid;
	}
}
