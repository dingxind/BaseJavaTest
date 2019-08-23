package cn.itcast.oa.action;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import cn.itcast.oa.base.BaseAction;
import cn.itcast.oa.domain.Department;
import cn.itcast.oa.domain.Role;
import cn.itcast.oa.domain.User;
import cn.itcast.oa.utils.DepartmentUtils;
import cn.itcast.oa.utils.MD5Utils;
  
  /**
   * 用户管理
   * @author ASUS
   *
   */
@SuppressWarnings("serial")
@Controller
@Scope("prototype")
public class UserAction extends BaseAction<User>{
	private Long departmentId;//属性驱动，部门id
	private Long[] roleIds;//属性驱动，岗位id
	    /**
	     * 查询所有用户
	     */
	  public String list(){
		 List<User>  list =  userService.findAll();
		  getValueStack().set("userList", list);
		  return "list";
	  }
	  
	  /**
	   * 根据ID删除
	   * @return
	   */
	  public String delete(){
		  userService.delete(model);
		  return "toList";
	  }
	  
	  /**
	   * 跳转到添加页面
	   * @return
	   */
	  public String addUI(){
		//准备数据（部门树形列表，岗位列表）
		  List<Department> topList = departmentService.findTopList();
		  List<Department> treeList = DepartmentUtils.getTreeList(topList, null);
		  
		   List<Role> roleList = roleService.findAll();
		   
		   getValueStack().set("treeList", treeList);
		   getValueStack().set("roleList", roleList);
		  
		  return "addUI";
	  }
	   /**
	    * 添加用户
	    * @return
	    */
	  public String add(){
		  if(departmentId !=null){
			   Department dept = departmentService.getById(departmentId);
			   model.setDepartment(dept);//用户关联部门
		  }
		  if(roleIds != null && roleIds.length>0){
			List<Role> roleList =  roleService.getByIds(roleIds);
			model.setRoles(new HashSet<Role>(roleList));
		  }
		  userService.save(model);
		  
		  return "toList";
	  }
	   /**
	    * 跳转到修改页面
	    * @return
	    */
	    public String editUI(){
	    User	 user =  userService.getByid(model.getId());
	    getValueStack().push(user);
	    	
	     //准备数据(部门树形列表，岗位列表）
	     List<Department> topList = departmentService.findTopList();
	     List<Department> treeList = DepartmentUtils.getTreeList(topList, null);
	     
	     //准备数据(岗位列表)
	      List<Role> roleList = roleService.findAll();
	      getValueStack().set("treeList", treeList);
	      getValueStack().set("roleList", roleList);
	      
	      if(user.getDepartment() !=null){
	    	  	//查询用户所属部门，用于回显
	    	     departmentId = user.getDepartment().getId();
	      }
	       Set<Role> roles = user.getRoles();
	       if(roles !=null && roles.size()>0){
	    	 //获得当前修改用户的岗位id，用于回显
	    	   int size = roles.size();
	    	   roleIds = new Long[size];
				int c = 0;
				for(Role role : roles){
					roleIds[c++] = role.getId();
				}
	       }
	      
	    	return "editUI";
	    }  
	   /**
	    * 修改用户
	    * @return
	    */
	  public String edit(){
		  //先查询
		  User user = userService.getByid(model.getId());
		  
		  user.setLoginName(model.getLoginName());
		  user.setName(model.getName());
		  user.setGender(model.getGender());
		  user.setPhone(model.getPhone());
		  user.setEmail(model.getEmail());
		  user.setDescription(model.getDescription());
		   
		  //用于部门数据
		  if(departmentId != null){
			  Department dept = departmentService.getById(departmentId);
			  user.setDepartment(dept);
		  }else{
			  user.setDepartment(null);
		  }
		  //用于岗位列表
		  if(roleIds !=null && roleIds.length>0){
			    List<Role> roles = roleService.getByIds(roleIds);
			    user.setRoles(new HashSet<Role>(roles));
		  }else{
				user.setRoles(null);
			}
		  userService.update(user);
		  return "toList";
	  }
	   /**
	    * 密码初始化
	    * @return
	    */
	  public String intiPassword(){
		   User user = userService.getByid(model.getId());
		  user.setPassword(MD5Utils.md5("1234"));
		  
		  userService.update(user);
		  return "toList";
	  }
	  /**
		 * 查询当前登录名是否存在
		 * @return
		 */
	  public String findByLoginName(){
		  String loginName = model.getLoginName();
		  int count = userService.findByLoginName(loginName);
		  ServletActionContext.getResponse().setContentType("text/html;charset=utf-8");
			String flag = "1";
			if(count > 0){
				//当前登录名已经存在，不能使用
				flag = "0";
			}
			try {
				ServletActionContext.getResponse().getWriter().print(flag);
			} catch (IOException e) {
				e.printStackTrace();
			}
		  return NONE;
	  }
	  /**
	   * 用户登录
	   * @return
	   */
	  public String login(){
           User user = userService.login(model);
		    if(user !=null){
		    	//用户登录
		    	//将登录用户放入Session
		    	ServletActionContext.getRequest().getSession().setAttribute("loginUser", user);
                return "home";
		    }else{
		    	//登录失败
				//设置错误提示
		    	this.addActionError("用户名或密码错误！");
		    	 return "loginUI";
		    }
		  
	  }
	  /**
		 * 用户退出系统
		 */
	   public String logout(){
		    //清空session中的用户
		   ServletActionContext.getRequest().getSession().removeAttribute("loginUser");
		   //跳转到登陆页面
		   return "loginUI";
	   } 
	  
	  
		public Long getDepartmentId() {
			return departmentId;
		}
		public void setDepartmentId(Long departmentId) {
			this.departmentId = departmentId;
		}
		public Long[] getRoleIds() {
			return roleIds;
		}
		public void setRoleIds(Long[] roleIds) {
			this.roleIds = roleIds;
		}
		

}
