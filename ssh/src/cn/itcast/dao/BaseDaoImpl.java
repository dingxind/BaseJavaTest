package cn.itcast.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.itcast.entity.Customer;

public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {
	
	//���췽�� ���������ѯ��ʵ�����Ͳ���
	private Class pclass;
	public BaseDaoImpl() {
		Class clazz =this.getClass();
		Type type = clazz.getGenericSuperclass();
		ParameterizedType ptype= (ParameterizedType) type;
		Type[] types=  ptype.getActualTypeArguments();
		Class tclass= (Class)types[0];
		this.pclass=tclass;
	}

	//����
	public void add(T t) {
		this.getHibernateTemplate().save(t);
		
	}
	
	//�޸�
	public void update(T t) {
		this.getHibernateTemplate().update(t);
		
	}

	//ɾ��
	public void delete(T t) {
		this.getHibernateTemplate().delete(t);
		
	}

	//����id��ѯ
	@SuppressWarnings("unchecked")
	public T findOne(int id) {
		
		return (T) this.getHibernateTemplate().get(pclass,id);
	}


	//��ѯ����
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		
		return (List<T>) this.getHibernateTemplate().find("from " +pclass.getSimpleName());
	}
	
	
	@SuppressWarnings("all")
	@Override
	public int findCount() {
		List<Object> list = (List<Object>) this.getHibernateTemplate().find("select count(*) from "+pclass.getSimpleName());
		
		if(list != null && list.size()!=0) {
			Object obj = list.get(0);
			
			Long lobj = (Long) obj;
			int count = lobj.intValue();
			return count;
		}
		return 0;
	
}

	@SuppressWarnings("all")
	@Override
	public List<T> findAllPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(pclass);
		List<T> list =(List<T>) this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		return list;
	}

	
}
