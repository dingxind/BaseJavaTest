package cn.itcast.oa.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.oa.dao.IRoleDao;
import cn.itcast.oa.domain.Role;

@Transactional
public class RoleService {
	private IRoleDao  roleDao;
	public void setRoleDao(IRoleDao roleDao) {
		this.roleDao = roleDao;
	}
	public List<Role> findAll() {
		
		return roleDao.findAll();
	}
	public Role findOne(Long id) {
		
		return roleDao.getByid(id);
	}
	public void delete(Long id) {
		roleDao.delete(id);
		
	}
	public void add(Role model) {
		roleDao.save(model);
		
	}
	public void update(Role model) {
		roleDao.update(model);
		
	}
	public List<Role> getByOnes(Long[] roleIds) {
		return roleDao.getByIds(roleIds);
	}

	
	

}
