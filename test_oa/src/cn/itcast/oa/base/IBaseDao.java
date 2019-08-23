package cn.itcast.oa.base;

import java.util.List;

public interface IBaseDao<T> {
	//���
	void add(T t);
	//�޸�
	void update(T t);
	//ɾ��
	void delete(T t);
	//����id��ѯ
	T findOne(long id);
	//��ѯ����
	List<T> findAll();
	//����id��ѯ���
	List<T> findByOnes(Long[] ids);

}
