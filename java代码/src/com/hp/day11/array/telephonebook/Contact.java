package com.hp.day11.array.telephonebook;

/**
 * 联系人实体类 封装性： 1.成员变量设置private 2.get,set方法，读写分离，控制访问权限 3.可以通过set方法修改值，隐藏实现 类的结构：
 * 成员变量 构造方法（参数由少到多） 普通方法 get,set方法
 * 
 * @author yangzhen
 */
public class Contact {
	private String name;
	private String gender;
	private int age;
	private String tel;
	private String qq;
	private String address;

	/**
	 * 构造方法？
	 */
	public Contact() {

	}

	public Contact(String name, String gender, int age, String tel, String qq, String address) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.tel = tel;
		this.qq = qq;
		this.address = address;
	}
	

	@Override
	public String toString() {
		return "姓名:"+name+" 性别:"+gender+" 年龄："+age+" 电话："+tel+" QQ:"+qq+" 地址:"+address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
