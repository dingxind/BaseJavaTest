package cn.itcast.oa.action;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.itcast.oa.base.BaseAction;
import cn.itcast.oa.domain.Forum;
import cn.itcast.oa.domain.PageBean;
import cn.itcast.oa.domain.Reply;
import cn.itcast.oa.domain.Topic;
import cn.itcast.oa.utils.HQLHelper;

  /**
   * 主题操作
   * @author ASUS
   *
   */
@SuppressWarnings("serial")
@Controller
@Scope("prototype")
public class TopicAction extends BaseAction<Topic> {
   private Long forumId; //熟悉驱动
   
   /**
    * 跳转到添加主题页面
    * @return
    */
    public String addUI(){
    	//根据版块id查询板块信息，用于页面显示
    	Forum forum = forumService.getById(forumId);
    	getValueStack().push(forum);
    	return "addUI";
    }
   /**
    * 添加主题
    * @return
    */
    public String add(){
    	Forum forum = forumService.getById(forumId);
        model.setForum(forum);
        model.setIpAddress(getIpAddress());
        model.setPostTime(new Date());
        model.setLastUpdateTime(model.getPostTime());
        model.setReplyCount(0);
        model.setType(0);
        model.setAuthor(getLoginUser());
        model.setLastReply(null);
        
        topicService.save(model);
    	
    	return "toTopicList";
    }
    /**
     * 显示单个主题
     * @return
     */
    public String show(){
    	//根据ID查询主题
    	Topic topic= topicService.getById(model.getId());
    	getValueStack().push(topic);
    	//根据主题查询对应的回复列表
//    	List<Reply> replyList = replyService.getReplyByTopci(model);
//    	getValueStack().set("replyList", replyList);
    	HQLHelper hh = new HQLHelper(Reply.class);
		hh.addWhere(" o.topic.id = ? ", model.getId());
		hh.addOrderBy(" o.postTime ", true);
		PageBean pb = replyService.getPageBean(hh,currentPage);
		getValueStack().push(pb);
    	return "show";
    }
    
public Long getForumId() {
	return forumId;
}

public void setForumId(Long forumId) {
	this.forumId = forumId;
}

   
}
