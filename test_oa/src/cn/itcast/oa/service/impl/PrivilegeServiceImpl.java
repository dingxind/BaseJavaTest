package cn.itcast.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.oa.dao.IPrivilegeDao;
import cn.itcast.oa.domain.Privilege;
import cn.itcast.oa.service.IPrivilegeService;

@Service
@Transactional
public class PrivilegeServiceImpl implements IPrivilegeService {
	@Resource
	  private IPrivilegeDao privilegeDao;

	public List<Privilege> findTopList() {
		return privilegeDao.findTopList();
	}

	public List<Privilege> getByIds(Long[] privilegeIds) {
		return privilegeDao.getByIds(privilegeIds);
	}

	public List<String> findAllUrl() {
		return privilegeDao.findAllUrl();
	}

}
