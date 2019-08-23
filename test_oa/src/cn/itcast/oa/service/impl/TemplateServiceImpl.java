package cn.itcast.oa.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.oa.dao.ITemplateDao;
import cn.itcast.oa.domain.Template;
import cn.itcast.oa.service.ITemplateService;
/**
 * 模版管理
 * @author ASUS
 *
 */
@Service
@Transactional
public class TemplateServiceImpl implements ITemplateService{
    @Resource
	private ITemplateDao templatDao;
    /**
     * 查询所有模版对象
     */
	public List<Template> findAll() {
		return templatDao.findAll();
	}
	public void save(Template model) {
		templatDao.save(model);
	}
	public void delete(Long id) {
		templatDao.delete(id);		
	}
	public Template getById(Long id) {
		return templatDao.getByid(id);
	}
	public void update(Template template) {
		templatDao.update(template);
	}
	public InputStream getInputStreamById(Long id) {
		Template template = templatDao.getByid(id);
		String filePath = template.getFilePath();
		InputStream in = null;
		try {
			in =new FileInputStream(new File(filePath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return in;
	}

}
