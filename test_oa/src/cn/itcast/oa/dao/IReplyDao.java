package cn.itcast.oa.dao;

import java.util.List;

import cn.itcast.oa.base.IBasekDao;
import cn.itcast.oa.domain.PageBean;
import cn.itcast.oa.domain.Reply;
import cn.itcast.oa.domain.Topic;

public interface IReplyDao extends IBasekDao<Reply> {

	public List<Reply> getReplyByTopic(Topic model);

	public PageBean getPageBean(int currentPage, Topic model);

}
