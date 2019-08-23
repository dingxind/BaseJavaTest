package cn.itcast.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.oa.dao.IDepartmentDao;
import cn.itcast.oa.domain.Department;
import cn.itcast.oa.service.IDepartmentService;
/**
 * 部门管理
 * @author zhaoqx
 *
 */
@Service
@Transactional
public class DepartmentServiceImpl  implements IDepartmentService{
	@Resource
	private IDepartmentDao departmentDao;

	public List<Department> findTopList() {
	  return departmentDao.findTopList();
	}

	public List<Department> findChildren(Long parentId) {
		return departmentDao.findChildren(parentId);
	}

	public Department getById(Long parentId) {
		return departmentDao.getByid(parentId);
	}

	public void delete(Department model) {
		departmentDao.delete(model.getId());
	}

	public List<Department> findAll() {
		return departmentDao.findAll();
	}

	public void save(Department model) {
		departmentDao.save(model);		
	}

	public void update(Department dept) {
		// TODO Auto-generated method stub
		
	}



}
