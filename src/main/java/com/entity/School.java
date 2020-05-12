package com.entity;
import com.util.VeDate;
public class School {
	private String schoolid = "S"+VeDate.getStringId();//生成主键编号
	private String schoolname;//学校名称
	private String cityid;//所在地区
	private String image;//图片
	private String addtime;//发布日期
	private String hits;//点击数
	private String asignnum;//报名人数
	private String contents;//学校介绍
	private String cityname;// 映射数据
	public String getSchoolid() { return schoolid; }
	public void setSchoolid(String schoolid) { this.schoolid = schoolid; }
	public String getSchoolname() { return this.schoolname; }
	public void setSchoolname(String schoolname) { this.schoolname = schoolname; }
	public String getCityid() { return this.cityid; }
	public void setCityid(String cityid) { this.cityid = cityid; }
	public String getImage() { return this.image; }
	public void setImage(String image) { this.image = image; }
	public String getAddtime() { return this.addtime; }
	public void setAddtime(String addtime) { this.addtime = addtime; }
	public String getHits() { return this.hits; }
	public void setHits(String hits) { this.hits = hits; }
	public String getAsignnum() { return this.asignnum; }
	public void setAsignnum(String asignnum) { this.asignnum = asignnum; }
	public String getContents() { return this.contents; }
	public void setContents(String contents) { this.contents = contents; }
	public String getCityname() { return this.cityname; }
	public void setCityname(String cityname) { this.cityname = cityname; }

// 重载方法 生成JSON类型字符串 
@Override
public String toString() {
return "School [schoolid="+this.schoolid+", schoolname="+this.schoolname+", cityid="+this.cityid+", image="+this.image+", addtime="+this.addtime+", hits="+this.hits+", asignnum="+this.asignnum+", contents="+this.contents+", cityname="+this.cityname+"]";
}



}




