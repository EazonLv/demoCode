package com.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.entity.Files;

@Repository("filesDAO") // Repository标签定义数据库连接的访问 Spring中直接
public interface FilesDAO {

	/**
* FilesDAO 接口 可以按名称直接调用files.xml配置文件的SQL语句
 */

	// 插入数据 调用entity包files.xml里的insertFiles配置 返回值0(失败),1(成功)
	public int insertFiles(Files files);

	// 更新数据 调用entity包files.xml里的updateFiles配置 返回值0(失败),1(成功)
	public int updateFiles(Files files);

	// 删除数据 调用entity包files.xml里的deleteFiles配置 返回值0(失败),1(成功)
	public int deleteFiles(String filesid);

	// 查询全部数据 调用entity包files.xml里的getAllFiles配置 返回List类型的数据
	public List<Files> getAllFiles();

	// 按照Files类里面的值精确查询 调用entity包files.xml里的getFilesByCond配置 返回List类型的数据
	public List<Files> getFilesByCond(Files files);

	// 按照Files类里面的值模糊查询 调用entity包files.xml里的getFilesByLike配置 返回List类型的数据
	public List<Files> getFilesByLike(Files files);

	// 按主键查询表返回单一的Files实例 调用entity包files.xml里的getFilesById配置
	public Files getFilesById(String filesid);

}


