package com.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.entity.School;
import com.service.SchoolService;
import com.entity.City;
import com.service.CityService;
import com.util.PageHelper;
import com.util.VeDate;
//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/school" , produces = "text/plain;charset=utf-8")
public class SchoolController extends BaseController {
	// 注入Service 由于标签的存在 所以不需要getter setter
	@Autowired
	private SchoolService schoolService;
	@Autowired
	private CityService cityService;

	// 准备添加数据
	@RequestMapping("createSchool.action")
	public String createSchool() {
		List<City> cityList = this.cityService.getAllCity();
		this.getRequest().setAttribute("cityList", cityList);
		return "admin/addschool";
	}
	// 添加数据
	@RequestMapping("addSchool.action")
	public String addSchool(School school) {
		school.setAddtime(VeDate.getStringDateShort());
		school.setHits("0");
		school.setAsignnum("0");
		this.schoolService.insertSchool(school);
		return "redirect:/school/createSchool.action";
	}

	// 通过主键删除数据
	@RequestMapping("deleteSchool.action")
	public String deleteSchool(String id) {
		this.schoolService.deleteSchool(id);
		return "redirect:/school/getAllSchool.action";
	}

	// 批量删除数据
	@RequestMapping("deleteSchoolByIds.action")
	public String deleteSchoolByIds() {
		String[] ids = this.getRequest().getParameterValues("schoolid");
		if (ids != null) {
			for (String schoolid : ids) {
				this.schoolService.deleteSchool(schoolid);
			}
		}
		return "redirect:/school/getAllSchool.action";
	}

	// 更新数据
	@RequestMapping("updateSchool.action")
	public String updateSchool(School school) {
		this.schoolService.updateSchool(school);
		return "redirect:/school/getAllSchool.action";
	}

	// 显示全部数据
	@RequestMapping("getAllSchool.action")
	public String getAllSchool(String number) {
		List<School> schoolList = this.schoolService.getAllSchool();
		PageHelper.getPage(schoolList, "school", null, null, 10, number, this.getRequest(), null);
		return "admin/listschool";
	}

	// 按条件查询数据 (模糊查询)
	@RequestMapping("querySchoolByCond.action")
	public String querySchoolByCond(String cond, String name, String number) {
		School school = new School();
		if(cond != null){
			if ("schoolname".equals(cond)) {
				school.setSchoolname(name);
			}
			if ("cityid".equals(cond)) {
				school.setCityid(name);
			}
			if ("image".equals(cond)) {
				school.setImage(name);
			}
			if ("addtime".equals(cond)) {
				school.setAddtime(name);
			}
			if ("hits".equals(cond)) {
				school.setHits(name);
			}
			if ("asignnum".equals(cond)) {
				school.setAsignnum(name);
			}
			if ("contents".equals(cond)) {
				school.setContents(name);
			}
		}

		List<String> nameList = new ArrayList<String>();
		List<String> valueList = new ArrayList<String>();
		nameList.add(cond);
		valueList.add(name);
		PageHelper.getPage(this.schoolService.getSchoolByLike(school), "school", nameList, valueList, 10, number, this.getRequest(), "query");
		name = null;
		cond = null;
		return "admin/queryschool";
	}

	// 按主键查询数据
	@RequestMapping("getSchoolById.action")
	public String getSchoolById(String id) {
		School school = this.schoolService.getSchoolById(id);
		this.getRequest().setAttribute("school", school);
		List<City> cityList = this.cityService.getAllCity();
		this.getRequest().setAttribute("cityList", cityList);
		return "admin/editschool";
	}


}
