package com.hp.day14.exception;

/**
 * 模拟登录过程
 * @author HP
 *
 */
public class Login {

	public static void main(String[] args) {
		String userName = "yang";
		String password = "123";
		/**
		 * equals--比较对象的时候：
		 * 重写了，按照重写的规则比较
		 * 没重写，比较的地址
		 * if-else如果只有一行，可以不写{}
		 * 信息提示：尤其是敏感信息，登录，不能提示太详细
		 * 使用系统时，可以提供详细信息：导入试题，导入失败。。。某一行，某个数据什么异常
		 */
		if("yang".equals(userName) && "123456".equals(password))
			System.out.println("登录成功");
		else
			throw new LoginException("用户名和密码不匹配");
	}

}
