package cn.itcast.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.oa.dao.IForumManageDao;
import cn.itcast.oa.domain.Forum;
import cn.itcast.oa.service.IForumManageService;
  /**
   * 版块管理
   * @author ASUS
   *
   */
@Service
@Transactional
public class ForumManageServiceImpl  implements IForumManageService{
     @Resource
	private IForumManageDao forumManageDao;
     
     /**
      * 查询模块
      */
	public List<Forum> findAll() {
		return forumManageDao.findAll();
	}

	public void delete(Forum model) {
		forumManageDao.delete(model.getId());		
	}

	public void save(Forum model) {
		forumManageDao.save(model);		
	}

	public Forum getById(Long id) {
		return forumManageDao.getByid(id);
	}

	public void update(Forum forum) {
		forumManageDao.update(forum);
	}

	public void moveUp(Long id) {
		forumManageDao.moveUp(id);		
	}

	public void moveDown(Long id) {
		forumManageDao.moveDown(id);		
	}

}
