package cn.itcast.oa.action;

import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;

import org.jbpm.api.ProcessDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.itcast.oa.service.IProcessDefinitionService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
 /**
  * 流程定义管理
  * @author ASUS
  *
  */
@Controller
@Scope("prototype")
public class ProcessDefinitionAction  extends ActionSupport{
    private File resource;//用于文件上传
    private String key;//属性驱动 流程定义的key
    private InputStream inputStream;//用于文件下载的输入
    private String id;//属性驱动 流程定义的id
    @Resource
    private IProcessDefinitionService processDefinitionService;
    
    /**
     * 查询流程定义列表
     * @return
     */
    public String list(){
    	List<ProcessDefinition> list = processDefinitionService.findLastList();
    	ActionContext.getContext().getValueStack().set("list", list);
    	return "list";
    }
    /**
     * 跳转到流程部署页面
     * @return
     */
    public String addUI(){
    	return "addUI";
    }
    /**
     * 流程部署定义
     * @return
     */
    public String add(){
    	processDefinitionService.deploy(resource);
    	return "toList";
    }
    /**
     * 删除流程部署定义
     * @return
     */
    public String delete(){
    	try {
			key = new String(key.getBytes("IOS-8859-1"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
    	processDefinitionService.deployByKey(key);
    	return "toList";
    }
    /**
     * 查看流程图
     * @return
     */
    public String showImage(){
    	try {
			id = new String(id.getBytes("ISO-8859-1"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
    	inputStream = processDefinitionService.getImageInputStream(id);
    	return "showImage";
    }
    
	public File getResource() {
		return resource;
	}
	public void setResource(File resource) {
		this.resource = resource;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public InputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
    
	
}
