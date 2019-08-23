package cn.itcast.oa.service;

import java.util.List;

import cn.itcast.oa.domain.Privilege;

public interface IPrivilegeService {

	public List<Privilege> findTopList();

	public List<Privilege> getByIds(Long[] privilegeIds);

	public List<String> findAllUrl();

}
