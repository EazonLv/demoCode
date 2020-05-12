package com.entity;
import com.util.VeDate;
public class Files {
	private String filesid = "F"+VeDate.getStringId();//生成主键编号
	private String filesname;//文件名称
	private String fileurl;//文件地址
	private String addtime;//发布日期
	private String memo;//备注
	public String getFilesid() { return filesid; }
	public void setFilesid(String filesid) { this.filesid = filesid; }
	public String getFilesname() { return this.filesname; }
	public void setFilesname(String filesname) { this.filesname = filesname; }
	public String getFileurl() { return this.fileurl; }
	public void setFileurl(String fileurl) { this.fileurl = fileurl; }
	public String getAddtime() { return this.addtime; }
	public void setAddtime(String addtime) { this.addtime = addtime; }
	public String getMemo() { return this.memo; }
	public void setMemo(String memo) { this.memo = memo; }

// 重载方法 生成JSON类型字符串 
@Override
public String toString() {
return "Files [filesid="+this.filesid+", filesname="+this.filesname+", fileurl="+this.fileurl+", addtime="+this.addtime+", memo="+this.memo+"]";
}



}




