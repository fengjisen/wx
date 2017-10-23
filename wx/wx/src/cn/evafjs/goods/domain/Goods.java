package cn.evafjs.goods.domain;

import java.io.Serializable;

public class Goods implements Serializable {
	private Integer gid;
	private String gname;
	private Double gprice;
	private String ginfo;
	private Integer gcount;
	private String gimage;
	private String gimage_min;
	private Boolean status;
	private Integer cid;
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Double getGprice() {
		return gprice;
	}
	public void setGprice(Double gprice) {
		this.gprice = gprice;
	}
	public String getGinfo() {
		return ginfo;
	}
	public void setGinfo(String ginfo) {
		this.ginfo = ginfo;
	}
	public Integer getGcount() {
		return gcount;
	}
	public void setGcount(Integer gcount) {
		this.gcount = gcount;
	}
	public String getGimage() {
		return gimage;
	}
	public void setGimage(String gimage) {
		this.gimage = gimage;
	}
	public String getGimage_min() {
		return gimage_min;
	}
	public void setGimage_min(String gimage_min) {
		this.gimage_min = gimage_min;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
}	
