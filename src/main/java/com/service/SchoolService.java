package com.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.entity.School;
@Service("schoolService")
public interface SchoolService {
	// 插入数据 调用schoolDAO里的insertSchool配置
	public int insertSchool(School school);

	// 更新数据 调用schoolDAO里的updateSchool配置
	public int updateSchool(School school);

	// 删除数据 调用schoolDAO里的deleteSchool配置
	public int deleteSchool(String schoolid);

	// 查询全部数据 调用schoolDAO里的getAllSchool配置
	public List<School> getAllSchool();

	// 按照School类里面的字段名称精确查询 调用schoolDAO里的getSchoolByCond配置
	public List<School> getSchoolByCond(School school);

	// 按照School类里面的字段名称模糊查询 调用schoolDAO里的getSchoolByLike配置
	public List<School> getSchoolByLike(School school);

	// 按主键查询表返回单一的School实例 调用schoolDAO里的getSchoolById配置
	public School getSchoolById(String schoolid);

}

