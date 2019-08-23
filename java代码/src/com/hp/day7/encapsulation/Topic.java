package com.hp.day7.encapsulation;

import java.util.Date;

/**
 * 帖子相关信息
 * @author HP
 *
 */
public class Topic {
	//帖子唯一标识
	private int topicId;
	
	private String content;
	
	private String title;
	
	private Date createDate;
	
	private String userName;

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
//	private int userId;
	
	
}
