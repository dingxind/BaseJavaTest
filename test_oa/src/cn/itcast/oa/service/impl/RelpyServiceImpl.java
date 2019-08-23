package cn.itcast.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.oa.dao.IReplyDao;
import cn.itcast.oa.domain.Forum;
import cn.itcast.oa.domain.PageBean;
import cn.itcast.oa.domain.Reply;
import cn.itcast.oa.domain.Topic;
import cn.itcast.oa.service.IReplyService;
import cn.itcast.oa.utils.HQLHelper;
@Service
@Transactional
public class RelpyServiceImpl  implements IReplyService{
     @Resource
	private IReplyDao replyDao;
     
	public List<Reply> getReplyByTopci(Topic model) {
		return replyDao.getReplyByTopic(model);
	}

	public void save(Reply model) {
          replyDao.save(model);
          Forum forum = model.getTopic().getForum();//持久化对象
          forum.setArticleCount(forum.getArticleCount() +1 );//文章数+1
          
          Topic topic = model.getTopic();
          topic.setLastUpdateTime(model.getPostTime());//最后回复时间
          topic.setLastReply(model);//主题的最后一个回复为当前回复
          topic.setReplyCount(topic.getReplyCount() +1); //回复数+1
          
	}
	/**
	 * 分页查询
	 */

	public PageBean getPageBean(int currentPage, Topic model) {
		return replyDao.getPageBean(currentPage,model);
	}
	/**
	 * 分页查询
	 */
	public PageBean getPageBean(HQLHelper hh, int currentPage) {
		return replyDao.getPageBean(hh, currentPage);
	}

}
