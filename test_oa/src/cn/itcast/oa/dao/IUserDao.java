package cn.itcast.oa.dao;

import cn.itcast.oa.base.IBasekDao;
import cn.itcast.oa.domain.User;

public interface IUserDao extends IBasekDao<User> {

	public int findByLoginName(String loginName);

	public User login(User model);

}
