package cn.itcast.oa.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.oa.dao.IUserDao;
import cn.itcast.oa.dao.impl.UserDaoImpl;
import cn.itcast.oa.domain.User;

@Transactional
public class UserService {

	private IUserDao userDao;
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
	public List<User> findAll() {
	
		return userDao.findAll();
	}
	public User findOne(long id) {
		
		return userDao.getByid(id);
	}
	public void delete(long id) {
	userDao.delete(id);
		
	}
	public void add(User model) {
		userDao.save(model);
	}
	public void update(User user) {
	userDao.update(user);
		
	}
	public int findByLoginName(String loginName) {
		
		return userDao.findByLoginName(loginName);
	}
	
	
}
