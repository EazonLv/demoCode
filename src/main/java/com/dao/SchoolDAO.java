package com.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.entity.School;

@Repository("schoolDAO") // Repository标签定义数据库连接的访问 Spring中直接
public interface SchoolDAO {

	/**
* SchoolDAO 接口 可以按名称直接调用school.xml配置文件的SQL语句
 */

	// 插入数据 调用entity包school.xml里的insertSchool配置 返回值0(失败),1(成功)
	public int insertSchool(School school);

	// 更新数据 调用entity包school.xml里的updateSchool配置 返回值0(失败),1(成功)
	public int updateSchool(School school);

	// 删除数据 调用entity包school.xml里的deleteSchool配置 返回值0(失败),1(成功)
	public int deleteSchool(String schoolid);

	// 查询全部数据 调用entity包school.xml里的getAllSchool配置 返回List类型的数据
	public List<School> getAllSchool();

	// 按照School类里面的值精确查询 调用entity包school.xml里的getSchoolByCond配置 返回List类型的数据
	public List<School> getSchoolByCond(School school);

	// 按照School类里面的值模糊查询 调用entity包school.xml里的getSchoolByLike配置 返回List类型的数据
	public List<School> getSchoolByLike(School school);

	// 按主键查询表返回单一的School实例 调用entity包school.xml里的getSchoolById配置
	public School getSchoolById(String schoolid);

}


