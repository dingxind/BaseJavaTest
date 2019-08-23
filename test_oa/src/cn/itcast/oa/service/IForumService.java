package cn.itcast.oa.service;

import java.util.List;

import cn.itcast.oa.domain.Forum;

/**
 * 参与版块操作
 * @author ASUS
 *
 */
public interface IForumService {

	public List<Forum> findAll();

	public Forum getById(Long id);

}
