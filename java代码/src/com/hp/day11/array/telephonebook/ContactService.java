package com.hp.day11.array.telephonebook;

import java.util.Scanner;

/**
 * 对联系人对象的操作，增删改查 1.添加--只要遇到有null的，就可以放进去 2.删除--根据姓名查找，如果找不到，提示错误；如果找到了提示信息后确认删除
 * 这样删除，会导致[Contact1,null,Contact2,Contact3,null,...] 有多少联系人？每次都需要去运算得到
 * 输出所有联系人：必须遍历数组 3.查询所有 4.根据姓名查询，假设姓名没有重复
 * 
 * 思路1：数组不可变，删除后，数组复制，缺点：会过多的占用内存 思路2：删除某个后，这个位置后面的移位 使用计数器：添加计数器+1，删除计数器减一
 * 
 * @author yangzhen
 */
public class ContactService {
	/**
	 * 成员变量的初始化： 1.系统初始化 2.直接赋值 3.构造方法初始化（实体类，有参） 4.非静态块
	 */
	private Contact[] contactArray = new Contact[100];

	// 计数器，记录联系人的个数
	private int count = 0;

	private Scanner sc = new Scanner(System.in);

	{
		contactArray[0] = new Contact("zhang", "male", 18, "138", "630", "山东济南");
		contactArray[1] = new Contact("wang", "female", 20, "139", "631", "山东济济宁");
		contactArray[2] = new Contact("zhao", "male", 28, "158", "632", "山东青岛");
		count = 3;
	}

	public void addContact() {
		// 如果电话本数量已满，不能再添加
		if (count >= contactArray.length) {
			System.out.println("电话本已满，不能再添加");
			return;
		}

		Contact contact = addContactInfo();
		contactArray[count] = contact;
		count++;
		System.out.println(contact.toString());
	}

	/**
	 * 封装输入信息
	 * 
	 * @return 输入的Contact对象
	 */
	public Contact addContactInfo() {
		System.out.print("姓名：");
		String name = sc.next();
		System.out.print("性别：");
		String gender = sc.next();
		System.out.print("年龄：");
		int age = sc.nextInt();
		System.out.print("电话：");
		String tel = sc.next();
		System.out.print("QQ：");
		String qq = sc.next();
		System.out.print("地址：");
		String address = sc.next();
		return new Contact(name, gender, age, tel, qq, address);
	}

	/**
	 * 根据姓名查询联系人
	 */
	public void findContactByName() {
		System.out.println("请输入要查询的联系人姓名");
		String name = sc.next();
		int index = findContactByName(name);
		if (-1 == index)
			System.out.println("联系人不存在");
		else
			System.out.println(contactArray[index].toString());
	}

	/**
	 * 删除联系人 先查询，不存在有提示 已存在，确认删除
	 */
	public void deleteContact() {
		System.out.println("请输入要删除的联系人姓名");
		String name = sc.next();
		int index = findContactByName(name);
		if (-1 == index)
			System.out.println("联系人不存在");
		else {
			/**
			 * 1.index位置置null 2.index位置后面的往前移动一位 3.原来的最后一位是null 4.count--
			 */
			contactArray[index] = null;
			/**
			 * index前的不动，移动从index开始，到count-1为止，后面的都是null不用管 如果i <
			 * count，当电话本存满的时候，删除功能会出现数组越界异常
			 */
			for (int i = index; i < count - 1; i++) {
				contactArray[i] = contactArray[i + 1];
			}
			contactArray[count - 1] = null;
			count--;
		}
	}

	/**
	 * 根据姓名查找联系人
	 * 
	 * @param name
	 *            要查找的姓名
	 * @return 返回联系人的序号，如果找到了，返回联系人的序号；找不到返回-1 返回对象操作不方便
	 */
	public int findContactByName(String name) {
		// 等于数组中不存在的序号即可
		int index = -1;
		// count后的都是null，没必要遍历
		for (int i = 0; i < count; i++) {
			if (contactArray[i].getName().equals(name)) {
				index = i;
				// 找到了联系人，后面不用循环了，不考虑重名的情况
				break;
			}
		}
		return index;
	}

	/**
	 * 更新联系人信息 1、输入姓名，调用findContactByName(String name)查询
	 * 2、根据返回值，做结果判断，判断是不存在还是需要更新
	 * 3、需要更新--输入（在addContact写了，需要提炼一个输入的方法--考虑代码的复用性）
	 */
	public void updateContact() {
		System.out.println("请输入要修改的联系人姓名：");
		String name = sc.next();
		int index = findContactByName(name);
		if (-1 == index)
			System.out.println("联系人不存在");
		else {
			Contact contact = addContactInfo();
			contactArray[index] = contact;
			System.out.println(contact.toString());
		}
	}

	public void findAllContacts() {
		if (count < 1)
			System.out.println("没有联系人信息~");
		else {
			for (int i = 0; i < count; i++)
				System.out.println(contactArray[i]);
		}
	}
}
