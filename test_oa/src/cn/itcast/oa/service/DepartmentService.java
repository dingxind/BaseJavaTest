package cn.itcast.oa.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.oa.dao.IDepartmentDao;
import cn.itcast.oa.domain.Department;

@Transactional
public class DepartmentService {
	private IDepartmentDao departmentDao;
	public void setDepartmentDao(IDepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
	public List<Department> findTopList() {
	
		return departmentDao.findTopList();
	}
	public List<Department> findChildren(Long parentId) {
	
		return departmentDao.findChildren(parentId);
	}
	public Department getById(Long parentId) {
	
		return departmentDao.getByid(parentId);
	}
	public Department findOne(Long id) {
	
		return departmentDao.getByid(id);
	}
	public void delete(Long id) {
		departmentDao.delete(id);
		
	}
	public List<Department> findAll() {
		
		return departmentDao.findAll();
	}
	public void add(Department model) {
	departmentDao.save(model);
		
	}
	public void update(Department dept) {
		departmentDao.update(dept);
		
	}
	
	
}
