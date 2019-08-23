package cn.itcast.oa.domain;

 /**
  * 回复实体
  * @author ASUS
  *
  */
public class Reply extends Article {
  private Topic topic;//当前回复属于哪个主题
  private int deleted;//删除标准 1表示已经删除
public Topic getTopic() {
	return topic;
}
public void setTopic(Topic topic) {
	this.topic = topic;
}
public int getDeleted() {
	return deleted;
}
public void setDeleted(int deleted) {
	this.deleted = deleted;
}
  
}
