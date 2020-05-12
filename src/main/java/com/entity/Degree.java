package com.entity;
import com.util.VeDate;
public class Degree {
	private String degreeid = "D"+VeDate.getStringId();//生成主键编号
	private String degreename;//学位名称
	private String price;//报名费用
	private String addtime;//创建日期
	private String memo;//备注
	public String getDegreeid() { return degreeid; }
	public void setDegreeid(String degreeid) { this.degreeid = degreeid; }
	public String getDegreename() { return this.degreename; }
	public void setDegreename(String degreename) { this.degreename = degreename; }
	public String getPrice() { return this.price; }
	public void setPrice(String price) { this.price = price; }
	public String getAddtime() { return this.addtime; }
	public void setAddtime(String addtime) { this.addtime = addtime; }
	public String getMemo() { return this.memo; }
	public void setMemo(String memo) { this.memo = memo; }

// 重载方法 生成JSON类型字符串 
@Override
public String toString() {
return "Degree [degreeid="+this.degreeid+", degreename="+this.degreename+", price="+this.price+", addtime="+this.addtime+", memo="+this.memo+"]";
}



}




