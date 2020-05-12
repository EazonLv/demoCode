package com.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.entity.Degree;
import com.service.DegreeService;
import com.util.PageHelper;
import com.util.VeDate;
//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/degree" , produces = "text/plain;charset=utf-8")
public class DegreeController extends BaseController {
	// 注入Service 由于标签的存在 所以不需要getter setter
	@Autowired
	private DegreeService degreeService;

	// 准备添加数据
	@RequestMapping("createDegree.action")
	public String createDegree() {
		return "admin/adddegree";
	}
	// 添加数据
	@RequestMapping("addDegree.action")
	public String addDegree(Degree degree) {
		degree.setAddtime(VeDate.getStringDateShort());
		this.degreeService.insertDegree(degree);
		return "redirect:/degree/createDegree.action";
	}

	// 通过主键删除数据
	@RequestMapping("deleteDegree.action")
	public String deleteDegree(String id) {
		this.degreeService.deleteDegree(id);
		return "redirect:/degree/getAllDegree.action";
	}

	// 批量删除数据
	@RequestMapping("deleteDegreeByIds.action")
	public String deleteDegreeByIds() {
		String[] ids = this.getRequest().getParameterValues("degreeid");
		if (ids != null) {
			for (String degreeid : ids) {
				this.degreeService.deleteDegree(degreeid);
			}
		}
		return "redirect:/degree/getAllDegree.action";
	}

	// 更新数据
	@RequestMapping("updateDegree.action")
	public String updateDegree(Degree degree) {
		this.degreeService.updateDegree(degree);
		return "redirect:/degree/getAllDegree.action";
	}

	// 显示全部数据
	@RequestMapping("getAllDegree.action")
	public String getAllDegree(String number) {
		List<Degree> degreeList = this.degreeService.getAllDegree();
		PageHelper.getPage(degreeList, "degree", null, null, 10, number, this.getRequest(), null);
		return "admin/listdegree";
	}

	// 按条件查询数据 (模糊查询)
	@RequestMapping("queryDegreeByCond.action")
	public String queryDegreeByCond(String cond, String name, String number) {
		Degree degree = new Degree();
		if(cond != null){
			if ("degreename".equals(cond)) {
				degree.setDegreename(name);
			}
			if ("price".equals(cond)) {
				degree.setPrice(name);
			}
			if ("addtime".equals(cond)) {
				degree.setAddtime(name);
			}
			if ("memo".equals(cond)) {
				degree.setMemo(name);
			}
		}

		List<String> nameList = new ArrayList<String>();
		List<String> valueList = new ArrayList<String>();
		nameList.add(cond);
		valueList.add(name);
		PageHelper.getPage(this.degreeService.getDegreeByLike(degree), "degree", nameList, valueList, 10, number, this.getRequest(), "query");
		name = null;
		cond = null;
		return "admin/querydegree";
	}

	// 按主键查询数据
	@RequestMapping("getDegreeById.action")
	public String getDegreeById(String id) {
		Degree degree = this.degreeService.getDegreeById(id);
		this.getRequest().setAttribute("degree", degree);
		return "admin/editdegree";
	}


}
