package com.hp.day14.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 做试题录入
 * 1.试题信息都需要录入--不能是空
 * 2.试题题号：int类型，大于0，题号唯一
 * 3.答案：必须是A,B,C,D或者小写中的一个，去前后空格
 * @author yangzhen
 *
 */
public class QuestionService {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//局部变量，用来接收从控制台的输入
		int id = 0;
		String content = null;
		String choiceA= null;
		String choiceB= null;
		String choiceC= null;
		String choiceD= null;
		String answer= null;
		try{
			System.out.println("请输入试题的id号：");
			//直接敲回车或者空格回车不识别
			id = sc.nextInt();
			if(id<1)
				throw new QuestionInputException("题号必须大于0");
		}catch(InputMismatchException e){
			//如果不是int类型都会报这个异常
			//try-catch嵌套，异常变量不能重名
			//catch中抛出的异常不能再被同级的catch再接收到
			try{
				throw new QuestionInputException("题号必须是int类型");
			}catch (QuestionInputException e2) {
				System.out.println(e2.getMessage());
			}
		}catch (QuestionInputException e) {
			//catch捕获异常做异常处理
			System.out.println(e.getMessage());
		}
		QuestionService qs = new QuestionService();
		/**
		 * next和nextLine使用上：
		 * 如果和其他输入nextInt混用，next，获取输入是没问题的
		 * 如果混用了，读的是没输入的信息，再加一句sc.nextLine();
		 * next和nextLine都可以获得一行的输入
		 * next如果直接敲回车或者空格再敲回车，认为你没输入
		 */
		sc.nextLine();
		try{
			content = qs.getInfo(sc,"题干");
			choiceA = qs.getInfo(sc,"选项A");
			choiceB = qs.getInfo(sc,"选项B");
			choiceC = qs.getInfo(sc,"选项C");
			choiceD = qs.getInfo(sc,"选项D");
			answer = qs.getInfo(sc,"答案");
			if(!(answer.equalsIgnoreCase("A")||answer.equalsIgnoreCase("B")||answer.equalsIgnoreCase("C")||answer.equalsIgnoreCase("D"))){
				throw new QuestionInputException("题号是"+id+"答案必须是A，B，C，D");
			}
			Question que = new Question(id, content, choiceA, choiceB, choiceC, choiceD, answer);
			System.out.println("试题录入成功~");
		}catch(QuestionInputException e){
			System.out.println(e.getMessage());
		}
	}

	/**
	 * 获得除了id以外的信息输入
	 * @param sc 输入对象
	 * @param info 具体的成员变量的含义
	 * @return 合法的输入信息
	 */
	public String getInfo(Scanner sc,String info){
		System.out.println("请输入"+info+"信息");
		String str = sc.nextLine().trim();
		if(str.length()==0)
			throw new QuestionInputException(info+"不能为空");
		return str;
	}
}
