package cn.itcast.oa.action;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.util.ValueStack;

import cn.itcast.oa.base.BaseAction;
import cn.itcast.oa.domain.Privilege;
import cn.itcast.oa.domain.Role;

@SuppressWarnings("serial")
@Controller
@Scope("prototype")
public class RoleAction extends BaseAction<Role>{
	private Long[] privilegeIds;//属性驱动，接收权限的id
         /**
          * 查询岗位列表
          */
	  public String list(){
		  
		 List<Role> list =  roleService.findAll();
		  //放入值栈
		 ValueStack vs = getValueStack();
		 vs.set("list", list);
		  return "list";
	  }
	  /**
	   * 根据id删除岗位
	   */
	   public String delete(){
		   roleService.delete(model);
		   return "toList";
	   }
	   /**
	    * 跳转到修改页面
	    */
	   public String editUI(){
		 //根据id查询岗位，用于回显
		 Role role =  roleService.getById(model.getId());
		 getValueStack().push(role);
		   
		   return "editUI";
	   }
	    /**
	     * 修改岗位列表
	     */
	   public String edit(){
		 //先查询，再修改
		   Role role = roleService.getById(model.getId());
		   role.setName(model.getName());
		   role.setDescription(model.getDescription());
		   
		   roleService.update(role);
		   
		   return "toList";
	   }
	   /**
	    * 跳转到添加页面
	    */
	   public String addUI(){
		   return "addUI";
	   }
	   /**
	    * 添加岗位
	    */
	   public String add(){
		   roleService.save(model);
		   return "toList";
	   }
	   /**
	    * 跳转到设置权限页面
	    */
	   public String setPrivilegeUI(){
		 //1 根据id查询当前要设置的角色，用于回显
		    Role role = roleService.getById(model.getId());
		    getValueStack().push(role);
		 //2 查询所有权限数据，在页面展示
		 List<Privilege> privilegeList =   privilegeService.findTopList();
		 getValueStack().set("privilegeList", privilegeList);
		 //3 查询当前角色对应的权限，用于页面回显
		 Set<Privilege> privileges = role.getPrivileges();
		 if(privileges !=null && privileges.size()>0){
			  privilegeIds = new Long[privileges.size()];
			  int index=0;
			  for(Privilege p : privileges){
				  privilegeIds[index++] = p.getId();
			  }
		 }
		   return "setPrivilegeUI";
	   }
	   /**
	    * 权限管理
	    */
	   public String setPrivilege(){
		 //先查询，再修改
		   Role role = roleService.getById(model.getId());
		   if(privilegeIds !=null && privilegeIds.length>0){
			  List<Privilege> privilegeList =   privilegeService.getByIds(privilegeIds);
			  role.setPrivileges(new HashSet<Privilege>(privilegeList));
		   }else{
			   role.setPrivileges(null);
		   }
		   roleService.update(role);
		   
		   return "toList";
	   }
	public Long[] getPrivilegeIds() {
		return privilegeIds;
	}
	public void setPrivilegeIds(Long[] privilegeIds) {
		this.privilegeIds = privilegeIds;
	}
	   
	   
}
