package cn.itcast.oa.dao;

import java.util.List;

import cn.itcast.oa.base.IBasekDao;
import cn.itcast.oa.domain.Department;

public interface IDepartmentDao extends IBasekDao<Department> {

  public List<Department> findTopList();

public List<Department> findChildren(Long parentId);
}
