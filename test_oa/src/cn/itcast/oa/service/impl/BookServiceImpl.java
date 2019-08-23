package cn.itcast.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.oa.dao.IBookDao;
import cn.itcast.oa.domain.Book;
import cn.itcast.oa.service.IBookService;
@Service
@Transactional
public class BookServiceImpl  implements IBookService {
	
    @Resource
	private IBookDao bookDao;
	
	public void save(Book book) {
         bookDao.save(book);	
	}

	public void delete(Long id) {
      bookDao.delete(id);		
	}

	public void update(Book book) {
     bookDao.update(book);
	}

	public Book getByid(Long id) {
		return bookDao.getByid(id);
	}

	public List<Book> getByIds(Long[] ids) {
		return bookDao.getByIds(ids);
	}

	public List<Book> findAll() {
		return bookDao.findAll();
	}

}
