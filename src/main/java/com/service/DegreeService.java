package com.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.entity.Degree;
@Service("degreeService")
public interface DegreeService {
	// 插入数据 调用degreeDAO里的insertDegree配置
	public int insertDegree(Degree degree);

	// 更新数据 调用degreeDAO里的updateDegree配置
	public int updateDegree(Degree degree);

	// 删除数据 调用degreeDAO里的deleteDegree配置
	public int deleteDegree(String degreeid);

	// 查询全部数据 调用degreeDAO里的getAllDegree配置
	public List<Degree> getAllDegree();

	// 按照Degree类里面的字段名称精确查询 调用degreeDAO里的getDegreeByCond配置
	public List<Degree> getDegreeByCond(Degree degree);

	// 按照Degree类里面的字段名称模糊查询 调用degreeDAO里的getDegreeByLike配置
	public List<Degree> getDegreeByLike(Degree degree);

	// 按主键查询表返回单一的Degree实例 调用degreeDAO里的getDegreeById配置
	public Degree getDegreeById(String degreeid);

}

