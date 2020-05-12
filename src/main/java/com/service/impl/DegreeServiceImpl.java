package com.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.DegreeDAO;
import com.entity.Degree;
import com.service.DegreeService;

@Service("degreeService")
public class DegreeServiceImpl implements DegreeService {
	@Autowired
	private DegreeDAO degreeDAO;
	@Override // 继承接口的新增 返回值0(失败),1(成功)
	public int insertDegree(Degree degree) {
		return this.degreeDAO.insertDegree(degree);
	}

	@Override // 继承接口的更新 返回值0(失败),1(成功)
	public int updateDegree(Degree degree) {
		return this.degreeDAO.updateDegree(degree);
	}

	@Override // 继承接口的删除 返回值0(失败),1(成功)
	public int deleteDegree(String degreeid) {
		return this.degreeDAO.deleteDegree(degreeid);
	}

	@Override // 继承接口的查询全部
	public List<Degree> getAllDegree() {
		return this.degreeDAO.getAllDegree();
	}

	@Override // 继承接口的按条件精确查询
	public List<Degree> getDegreeByCond(Degree degree) {
		return this.degreeDAO.getDegreeByCond(degree);
	}

	@Override // 继承接口的按条件模糊查询
	public List<Degree> getDegreeByLike(Degree degree) {
		return this.degreeDAO.getDegreeByLike(degree);
	}

	@Override // 继承接口的按主键查询 返回Entity实例
	public Degree getDegreeById(String degreeid) {
		return this.degreeDAO.getDegreeById(degreeid);
	}

}

