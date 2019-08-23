package cn.itcast.oa.service;

import java.util.List;

import cn.itcast.oa.domain.PageBean;
import cn.itcast.oa.domain.Reply;
import cn.itcast.oa.domain.Topic;
import cn.itcast.oa.utils.HQLHelper;

public interface IReplyService {

	public List<Reply> getReplyByTopci(Topic model);

	public void save(Reply model);

	public PageBean getPageBean(int currentPage, Topic model);

	public PageBean getPageBean(HQLHelper hh, int currentPage);





}
