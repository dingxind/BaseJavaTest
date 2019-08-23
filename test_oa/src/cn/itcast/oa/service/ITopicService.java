package cn.itcast.oa.service;

import java.util.List;

import cn.itcast.oa.domain.Forum;
import cn.itcast.oa.domain.PageBean;
import cn.itcast.oa.domain.Topic;
import cn.itcast.oa.utils.HQLHelper;

public interface ITopicService {

	public List<Topic> findTopicByForum(Forum model);

	public void save(Topic model);

	public Topic getById(Long topicId);

	public PageBean getPageBean(HQLHelper hh, int currentPage);

}
