package cn.itcast.oa.interceptor;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import cn.itcast.oa.domain.User;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
 /**
  * 进行权限检查的拦截器
  * @author ASUS
  *
  */
public class CheckPrivilegeInterceptor extends AbstractInterceptor{

	/**
	 * 拦截方法
	 */
	public String intercept(ActionInvocation ai) throws Exception {
		//从session中获取用户
	    User user = (User) ServletActionContext.getRequest().getSession().getAttribute("loginUser");
	    String actionName = ai.getProxy().getActionName();
	    String namespace = ai.getProxy().getNamespace();
	    String url = namespace + actionName ;
	    
	    if(url.endsWith("UI")){
	    	//如果请求URL以UI结尾 就去掉UI
	    	url=url.substring(0, url.length() -2);
	    	System.out.println("访问URL=" + url);
	    }
	    //用户登录
	    if(user == null){
	    	// a 如果用户访问的是登录功能,则放行
	    	if("/user_login".equals(url)){
	    		//放行
	    		return ai.invoke();
	    	}else{
	    		// b 如果用户访问的不是登录功能，则跳转到登录页面
	    		return "loginUI";
	    	}
	    }else{
	    	//用户已经登陆
	    	List<String> allUrl = (List<String>) ServletActionContext.getServletContext().getAttribute("allUrl");
	    	//如果用户访问的是要验证的权限
	    	if(allUrl.contains(url)){
	    		boolean b =  user.hasPrivilegeByUrl(url);
	    		if(b){
	    			//有权限则放行
	    			return ai.invoke();
	    		}else{
	    			//没有权限则调整到错误提示页面
	    			return "noPrivilegeUI";
	    		}
	    	}else{
	    		//如果用户访问的是不需要权限的
	    		return ai.invoke();
	    				
	    	}
	    }
	    
	}

}
