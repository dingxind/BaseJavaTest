package cn.itcast.oa.service;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.oa.dao.IBookDao;
import cn.itcast.oa.domain.Book;

@Transactional
public class BookService {
	
	private IBookDao bookDao;
	public void setBookDao(IBookDao bookDao) {
		this.bookDao = bookDao;
	}

	public void save(Book book) {
		bookDao.save(book);
		
	}

}
