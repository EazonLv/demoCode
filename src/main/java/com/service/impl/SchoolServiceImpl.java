package com.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.SchoolDAO;
import com.entity.School;
import com.service.SchoolService;

@Service("schoolService")
public class SchoolServiceImpl implements SchoolService {
	@Autowired
	private SchoolDAO schoolDAO;
	@Override // 继承接口的新增 返回值0(失败),1(成功)
	public int insertSchool(School school) {
		return this.schoolDAO.insertSchool(school);
	}

	@Override // 继承接口的更新 返回值0(失败),1(成功)
	public int updateSchool(School school) {
		return this.schoolDAO.updateSchool(school);
	}

	@Override // 继承接口的删除 返回值0(失败),1(成功)
	public int deleteSchool(String schoolid) {
		return this.schoolDAO.deleteSchool(schoolid);
	}

	@Override // 继承接口的查询全部
	public List<School> getAllSchool() {
		return this.schoolDAO.getAllSchool();
	}

	@Override // 继承接口的按条件精确查询
	public List<School> getSchoolByCond(School school) {
		return this.schoolDAO.getSchoolByCond(school);
	}

	@Override // 继承接口的按条件模糊查询
	public List<School> getSchoolByLike(School school) {
		return this.schoolDAO.getSchoolByLike(school);
	}

	@Override // 继承接口的按主键查询 返回Entity实例
	public School getSchoolById(String schoolid) {
		return this.schoolDAO.getSchoolById(schoolid);
	}

}

