package com.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.FilesDAO;
import com.entity.Files;
import com.service.FilesService;

@Service("filesService")
public class FilesServiceImpl implements FilesService {
	@Autowired
	private FilesDAO filesDAO;
	@Override // 继承接口的新增 返回值0(失败),1(成功)
	public int insertFiles(Files files) {
		return this.filesDAO.insertFiles(files);
	}

	@Override // 继承接口的更新 返回值0(失败),1(成功)
	public int updateFiles(Files files) {
		return this.filesDAO.updateFiles(files);
	}

	@Override // 继承接口的删除 返回值0(失败),1(成功)
	public int deleteFiles(String filesid) {
		return this.filesDAO.deleteFiles(filesid);
	}

	@Override // 继承接口的查询全部
	public List<Files> getAllFiles() {
		return this.filesDAO.getAllFiles();
	}

	@Override // 继承接口的按条件精确查询
	public List<Files> getFilesByCond(Files files) {
		return this.filesDAO.getFilesByCond(files);
	}

	@Override // 继承接口的按条件模糊查询
	public List<Files> getFilesByLike(Files files) {
		return this.filesDAO.getFilesByLike(files);
	}

	@Override // 继承接口的按主键查询 返回Entity实例
	public Files getFilesById(String filesid) {
		return this.filesDAO.getFilesById(filesid);
	}

}

