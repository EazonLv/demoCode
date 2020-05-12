package com.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.entity.Degree;

@Repository("degreeDAO") // Repository标签定义数据库连接的访问 Spring中直接
public interface DegreeDAO {

	/**
* DegreeDAO 接口 可以按名称直接调用degree.xml配置文件的SQL语句
 */

	// 插入数据 调用entity包degree.xml里的insertDegree配置 返回值0(失败),1(成功)
	public int insertDegree(Degree degree);

	// 更新数据 调用entity包degree.xml里的updateDegree配置 返回值0(失败),1(成功)
	public int updateDegree(Degree degree);

	// 删除数据 调用entity包degree.xml里的deleteDegree配置 返回值0(失败),1(成功)
	public int deleteDegree(String degreeid);

	// 查询全部数据 调用entity包degree.xml里的getAllDegree配置 返回List类型的数据
	public List<Degree> getAllDegree();

	// 按照Degree类里面的值精确查询 调用entity包degree.xml里的getDegreeByCond配置 返回List类型的数据
	public List<Degree> getDegreeByCond(Degree degree);

	// 按照Degree类里面的值模糊查询 调用entity包degree.xml里的getDegreeByLike配置 返回List类型的数据
	public List<Degree> getDegreeByLike(Degree degree);

	// 按主键查询表返回单一的Degree实例 调用entity包degree.xml里的getDegreeById配置
	public Degree getDegreeById(String degreeid);

}


