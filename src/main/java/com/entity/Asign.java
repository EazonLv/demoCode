package com.entity;
import com.util.VeDate;
public class Asign {
	private String asignid = "A"+VeDate.getStringId();//生成主键编号
	private String ano;//报名单号
	private String usersid;//学生
	private String schoolid;//学校
	private String degreeid;//学位
	private String fileurl;//报名文件
	private String price;//费用
	private String addtime;//报名日期
	private String status;//状态
	private String memo;//备注
	private String realname;// 映射数据
	private String schoolname;// 映射数据
	private String degreename;// 映射数据
	public String getAsignid() { return asignid; }
	public void setAsignid(String asignid) { this.asignid = asignid; }
	public String getAno() { return this.ano; }
	public void setAno(String ano) { this.ano = ano; }
	public String getUsersid() { return this.usersid; }
	public void setUsersid(String usersid) { this.usersid = usersid; }
	public String getSchoolid() { return this.schoolid; }
	public void setSchoolid(String schoolid) { this.schoolid = schoolid; }
	public String getDegreeid() { return this.degreeid; }
	public void setDegreeid(String degreeid) { this.degreeid = degreeid; }
	public String getFileurl() { return this.fileurl; }
	public void setFileurl(String fileurl) { this.fileurl = fileurl; }
	public String getPrice() { return this.price; }
	public void setPrice(String price) { this.price = price; }
	public String getAddtime() { return this.addtime; }
	public void setAddtime(String addtime) { this.addtime = addtime; }
	public String getStatus() { return this.status; }
	public void setStatus(String status) { this.status = status; }
	public String getMemo() { return this.memo; }
	public void setMemo(String memo) { this.memo = memo; }
	public String getRealname() { return this.realname; }
	public void setRealname(String realname) { this.realname = realname; }
	public String getSchoolname() { return this.schoolname; }
	public void setSchoolname(String schoolname) { this.schoolname = schoolname; }
	public String getDegreename() { return this.degreename; }
	public void setDegreename(String degreename) { this.degreename = degreename; }

// 重载方法 生成JSON类型字符串 
@Override
public String toString() {
return "Asign [asignid="+this.asignid+", ano="+this.ano+", usersid="+this.usersid+", schoolid="+this.schoolid+", degreeid="+this.degreeid+", fileurl="+this.fileurl+", price="+this.price+", addtime="+this.addtime+", status="+this.status+", memo="+this.memo+", realname="+this.realname+", schoolname="+this.schoolname+", degreename="+this.degreename+"]";
}



}




