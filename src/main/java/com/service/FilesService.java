package com.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.entity.Files;
@Service("filesService")
public interface FilesService {
	// 插入数据 调用filesDAO里的insertFiles配置
	public int insertFiles(Files files);

	// 更新数据 调用filesDAO里的updateFiles配置
	public int updateFiles(Files files);

	// 删除数据 调用filesDAO里的deleteFiles配置
	public int deleteFiles(String filesid);

	// 查询全部数据 调用filesDAO里的getAllFiles配置
	public List<Files> getAllFiles();

	// 按照Files类里面的字段名称精确查询 调用filesDAO里的getFilesByCond配置
	public List<Files> getFilesByCond(Files files);

	// 按照Files类里面的字段名称模糊查询 调用filesDAO里的getFilesByLike配置
	public List<Files> getFilesByLike(Files files);

	// 按主键查询表返回单一的Files实例 调用filesDAO里的getFilesById配置
	public Files getFilesById(String filesid);

}

