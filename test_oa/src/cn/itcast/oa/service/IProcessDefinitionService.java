package cn.itcast.oa.service;

import java.io.File;
import java.io.InputStream;
import java.util.List;

import org.jbpm.api.ProcessDefinition;
 
/**
 * 流程定义管理
 * @author ASUS
 *
 */
public interface IProcessDefinitionService {

	public List<ProcessDefinition> findLastList();

	public void deploy(File resource);

	public void deployByKey(String key);

	public InputStream getImageInputStream(String id);



}
