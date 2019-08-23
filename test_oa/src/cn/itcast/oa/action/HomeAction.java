package cn.itcast.oa.action;

import org.springframework.stereotype.Controller;
 /**
  * 页面整合
  * @author ASUS
  *
  */
@Controller
public class HomeAction {
    /**
     * 整合top.jsp页面
     */
	 public String top(){
		 return "top";
	 }
	 /**
	  * 整合left.jsp页面
	  */
	 public String left(){
		 return "left";
	 }
	 /**
	  * 整合right.jsp页面
	  */
	 public String right(){
		 
		 return "right";
	 }
	 /**
	  * 整合bottom.jsp页面
	  */
	 public String bottom(){
		 return "bottom";
	 }
	 /**
	  * 整合index.jsp
	  */
	 public String index(){
		 return "index";
	 }
}
