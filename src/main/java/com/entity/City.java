package com.entity;
import com.util.VeDate;
public class City {
	private String cityid = "C"+VeDate.getStringId();//生成主键编号
	private String cityname;//地区名称
	private String memo;//备注
	public String getCityid() { return cityid; }
	public void setCityid(String cityid) { this.cityid = cityid; }
	public String getCityname() { return this.cityname; }
	public void setCityname(String cityname) { this.cityname = cityname; }
	public String getMemo() { return this.memo; }
	public void setMemo(String memo) { this.memo = memo; }

// 重载方法 生成JSON类型字符串 
@Override
public String toString() {
return "City [cityid="+this.cityid+", cityname="+this.cityname+", memo="+this.memo+"]";
}



}




