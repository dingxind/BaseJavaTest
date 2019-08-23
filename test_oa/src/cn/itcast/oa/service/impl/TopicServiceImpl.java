package cn.itcast.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import cn.itcast.oa.dao.ITopicDao;
import cn.itcast.oa.domain.Forum;
import cn.itcast.oa.domain.PageBean;
import cn.itcast.oa.domain.Topic;
import cn.itcast.oa.service.ITopicService;
import cn.itcast.oa.utils.HQLHelper;
@Service
@Transactional
public class TopicServiceImpl  implements ITopicService{
   @Resource
   private ITopicDao topicDao;
   
	public List<Topic> findTopicByForum(Forum model) {
		return topicDao.findTopicByForum(model);
	}

	public void save(Topic model) {
		topicDao.save(model);		
	}

	public Topic getById(Long topicId) {
		return topicDao.getByid(topicId);
	}

	public PageBean getPageBean(HQLHelper hh, int currentPage) {
		return topicDao.getPageBean(hh, currentPage);
	}

}
