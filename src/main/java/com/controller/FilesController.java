package com.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.entity.Files;
import com.service.FilesService;
import com.util.PageHelper;
import com.util.VeDate;
//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/files" , produces = "text/plain;charset=utf-8")
public class FilesController extends BaseController {
	// 注入Service 由于标签的存在 所以不需要getter setter
	@Autowired
	private FilesService filesService;

	// 准备添加数据
	@RequestMapping("createFiles.action")
	public String createFiles() {
		return "admin/addfiles";
	}
	// 添加数据
	@RequestMapping("addFiles.action")
	public String addFiles(Files files) {
		files.setAddtime(VeDate.getStringDateShort());
		this.filesService.insertFiles(files);
		return "redirect:/files/createFiles.action";
	}

	// 通过主键删除数据
	@RequestMapping("deleteFiles.action")
	public String deleteFiles(String id) {
		this.filesService.deleteFiles(id);
		return "redirect:/files/getAllFiles.action";
	}

	// 批量删除数据
	@RequestMapping("deleteFilesByIds.action")
	public String deleteFilesByIds() {
		String[] ids = this.getRequest().getParameterValues("filesid");
		if (ids != null) {
			for (String filesid : ids) {
				this.filesService.deleteFiles(filesid);
			}
		}
		return "redirect:/files/getAllFiles.action";
	}

	// 更新数据
	@RequestMapping("updateFiles.action")
	public String updateFiles(Files files) {
		this.filesService.updateFiles(files);
		return "redirect:/files/getAllFiles.action";
	}

	// 显示全部数据
	@RequestMapping("getAllFiles.action")
	public String getAllFiles(String number) {
		List<Files> filesList = this.filesService.getAllFiles();
		PageHelper.getPage(filesList, "files", null, null, 10, number, this.getRequest(), null);
		return "admin/listfiles";
	}

	// 按条件查询数据 (模糊查询)
	@RequestMapping("queryFilesByCond.action")
	public String queryFilesByCond(String cond, String name, String number) {
		Files files = new Files();
		if(cond != null){
			if ("filesname".equals(cond)) {
				files.setFilesname(name);
			}
			if ("fileurl".equals(cond)) {
				files.setFileurl(name);
			}
			if ("addtime".equals(cond)) {
				files.setAddtime(name);
			}
			if ("memo".equals(cond)) {
				files.setMemo(name);
			}
		}

		List<String> nameList = new ArrayList<String>();
		List<String> valueList = new ArrayList<String>();
		nameList.add(cond);
		valueList.add(name);
		PageHelper.getPage(this.filesService.getFilesByLike(files), "files", nameList, valueList, 10, number, this.getRequest(), "query");
		name = null;
		cond = null;
		return "admin/queryfiles";
	}

	// 按主键查询数据
	@RequestMapping("getFilesById.action")
	public String getFilesById(String id) {
		Files files = this.filesService.getFilesById(id);
		this.getRequest().setAttribute("files", files);
		return "admin/editfiles";
	}


}
