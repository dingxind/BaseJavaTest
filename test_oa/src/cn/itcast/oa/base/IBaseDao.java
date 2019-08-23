package cn.itcast.oa.base;

import java.util.List;

public interface IBaseDao<T> {
	//添加
	void add(T t);
	//修改
	void update(T t);
	//删除
	void delete(T t);
	//根据id查询
	T findOne(long id);
	//查询所有
	List<T> findAll();
	//根据id查询多个
	List<T> findByOnes(Long[] ids);

}
