package com.hp.day14.exception;

/**
 * 1.继承某个异常
 * 2.无参构造方法
 * 3.有参构造方法（传递信息）
 * @author HP
 *
 */
public class QuestionInputException extends RuntimeException{
	public QuestionInputException(){
		
	}
	
	/**
	 * @param info 错误提示
	 */
	public QuestionInputException(String info){
		super("试题录入异常："+info);
	}
}
