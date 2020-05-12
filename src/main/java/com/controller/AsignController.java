package com.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.entity.Asign;
import com.service.AsignService;
import com.entity.Users;
import com.entity.School;
import com.entity.Degree;
import com.service.UsersService;
import com.service.SchoolService;
import com.service.DegreeService;
import com.util.PageHelper;
import com.util.VeDate;

//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/asign", produces = "text/plain;charset=utf-8")
public class AsignController extends BaseController {
	// 注入Service 由于标签的存在 所以不需要getter setter
	@Autowired
	private AsignService asignService;
	@Autowired
	private UsersService usersService;
	@Autowired
	private SchoolService schoolService;
	@Autowired
	private DegreeService degreeService;

	// 准备添加数据
	@RequestMapping("createAsign.action")
	public String createAsign() {
		List<Users> usersList = this.usersService.getAllUsers();
		this.getRequest().setAttribute("usersList", usersList);
		List<School> schoolList = this.schoolService.getAllSchool();
		this.getRequest().setAttribute("schoolList", schoolList);
		List<Degree> degreeList = this.degreeService.getAllDegree();
		this.getRequest().setAttribute("degreeList", degreeList);
		return "admin/addasign";
	}

	// 添加数据
	@RequestMapping("addAsign.action")
	public String addAsign(Asign asign) {
		asign.setAddtime(VeDate.getStringDateShort());
		asign.setStatus("");
		this.asignService.insertAsign(asign);
		return "redirect:/asign/createAsign.action";
	}

	// 通过主键删除数据
	@RequestMapping("deleteAsign.action")
	public String deleteAsign(String id) {
		this.asignService.deleteAsign(id);
		return "redirect:/asign/getAllAsign.action";
	}

	// 批量删除数据
	@RequestMapping("deleteAsignByIds.action")
	public String deleteAsignByIds() {
		String[] ids = this.getRequest().getParameterValues("asignid");
		if (ids != null) {
			for (String asignid : ids) {
				this.asignService.deleteAsign(asignid);
			}
		}
		return "redirect:/asign/getAllAsign.action";
	}

	// 更新数据
	@RequestMapping("updateAsign.action")
	public String updateAsign(Asign asign) {
		this.asignService.updateAsign(asign);
		return "redirect:/asign/getAllAsign.action";
	}

	// 更新状态
	@RequestMapping("status.action")
	public String status(String id) {
		String status = "报名成功";
		Asign asign = this.asignService.getAsignById(id);
		asign.setStatus(status);
		this.asignService.updateAsign(asign);
		return "redirect:/asign/getAllAsign.action";
	}

	@RequestMapping("failed.action")
	public String failed(String id) {
		String status = "报名失败";
		Asign asign = this.asignService.getAsignById(id);
		asign.setStatus(status);
		this.asignService.updateAsign(asign);
		return "redirect:/asign/getAllAsign.action";
	}

	// 显示全部数据
	@RequestMapping("getAllAsign.action")
	public String getAllAsign(String number) {
		List<Asign> asignList = this.asignService.getAllAsign();
		PageHelper.getPage(asignList, "asign", null, null, 10, number, this.getRequest(), null);
		return "admin/listasign";
	}

	// 按条件查询数据 (模糊查询)
	@RequestMapping("queryAsignByCond.action")
	public String queryAsignByCond(String cond, String name, String number) {
		Asign asign = new Asign();
		if (cond != null) {
			if ("ano".equals(cond)) {
				asign.setAno(name);
			}
			if ("usersid".equals(cond)) {
				asign.setUsersid(name);
			}
			if ("schoolid".equals(cond)) {
				asign.setSchoolid(name);
			}
			if ("degreeid".equals(cond)) {
				asign.setDegreeid(name);
			}
			if ("fileurl".equals(cond)) {
				asign.setFileurl(name);
			}
			if ("price".equals(cond)) {
				asign.setPrice(name);
			}
			if ("addtime".equals(cond)) {
				asign.setAddtime(name);
			}
			if ("status".equals(cond)) {
				asign.setStatus(name);
			}
			if ("memo".equals(cond)) {
				asign.setMemo(name);
			}
		}

		List<String> nameList = new ArrayList<String>();
		List<String> valueList = new ArrayList<String>();
		nameList.add(cond);
		valueList.add(name);
		PageHelper.getPage(this.asignService.getAsignByLike(asign), "asign", nameList, valueList, 10, number, this.getRequest(), "query");
		name = null;
		cond = null;
		return "admin/queryasign";
	}

	// 按主键查询数据
	@RequestMapping("getAsignById.action")
	public String getAsignById(String id) {
		Asign asign = this.asignService.getAsignById(id);
		this.getRequest().setAttribute("asign", asign);
		List<Users> usersList = this.usersService.getAllUsers();
		this.getRequest().setAttribute("usersList", usersList);
		List<School> schoolList = this.schoolService.getAllSchool();
		this.getRequest().setAttribute("schoolList", schoolList);
		List<Degree> degreeList = this.degreeService.getAllDegree();
		this.getRequest().setAttribute("degreeList", degreeList);
		return "admin/editasign";
	}

}
