package cn.itcast.oa.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import cn.itcast.oa.domain.Department;

public class DepartmentUtils {
 
	/**
	 * @param topList  椤剁骇閮ㄩ棬鍒楄〃
	 * @param removeId 鍒犻櫎閮ㄩ棬鐨刬d
	 * @return
	 */
	 public static List<Department> getTreeList(List<Department> topList,Long removeId){
		 List<Department>  treeList = new ArrayList<Department>();
		 walkTree(topList,treeList,"鈹�",removeId);
		 
		 return treeList;
	 }
	
	
	
	/**
	 * 缁勭粐鏍戝舰閮ㄩ棬鏁版嵁
	 */
	public static void walkTree(Collection<Department> topList,List<Department> treeList,String prefix,Long removeId){
		 for(Department d : topList){
			 if(removeId != null && d.getId().equals(removeId)){
				 continue;
			 }
			 Department copy = new Department();
			 copy.setId(d.getId());
			 copy.setName(prefix + d.getName());
			 //椤剁偣
			 treeList.add(copy);
			 //瀛愭爲
			 Set<Department> children = d.getChildren();
			 walkTree(children,treeList,"銆�"+prefix,removeId);
			 
		 }
	}
	
	     
}
