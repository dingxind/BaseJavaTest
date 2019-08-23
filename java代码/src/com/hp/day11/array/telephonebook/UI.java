package com.hp.day11.array.telephonebook;

import java.util.Scanner;

public class UI {

	/**
	 * 打印主界面
	 */
	public void printUI(){
		System.out.println("------------------电话本管理系统------------------");
		System.out.println("1.添加     2.删除     3.修改    4.查询所有     5.根据姓名查询    0退出");
		System.out.println("------------------电话本管理系统------------------");
		System.out.println("请选择业务：");
	}
	/**
	 * 1.操作完后又回到主界面--循环
	 * 		for循环，知晓循环次数
	 * 		while循环，可以不知晓次数while(true)
	 * 2.分支结构 if-else switch
	 * 		switch
	 * 3.需要输入：Scanner sc = new Scannner(System.in)
	 * @param args
	 */
	public static void main(String[] args) {
		UI ui = new UI();
		ContactService cs = new ContactService();
		Scanner sc = new Scanner(System.in);
		while(true){
			ui.printUI();
			//提供的选项
			int choice = sc.nextInt();
			switch(choice){
				//添加
				case 1:
					cs.addContact();
					break;
				//删除
				case 2:
					cs.deleteContact();
					break;
				//修改
				case 3:
					cs.updateContact();
					break;
				//查询所有
				case 4:
					cs.findAllContacts();
					break;
				//根据姓名查询
				case 5:
					cs.findContactByName();
					break;
				case 0:
					System.exit(0);
					break;
			}
		}
	}

}
