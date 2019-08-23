package cn.itcast.oa.dao;

import cn.itcast.oa.base.IBasekDao;
import cn.itcast.oa.domain.Forum;

public interface IForumManageDao extends IBasekDao<Forum> {

	public void moveUp(Long id);

	public void moveDown(Long id);

}
