package com.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		Class userClazz = Class.forName("com.test.User");
		Field [] userFields = userClazz.getDeclaredFields();
		for(int i = 0;i<userFields.length;i++){
			System.out.println(userFields[i]);
		}
		User user1 = (User) userClazz.newInstance();
		Field schoolField = userClazz.getDeclaredField("school");
		schoolField.setAccessible(true);
		schoolField.set(user1, "北京大学");
		System.out.println(schoolField.get(user1));
		System.out.println("");
		Method[] methodsArray = userClazz.getDeclaredMethods();
		for(int i = 0;i<methodsArray.length;i++){
			System.out.println(methodsArray[i]);
		}
		System.out.println("");
		Method[] methodsArray2 = userClazz.getMethods();
		for(int i = 0;i<methodsArray2.length;i++){
			System.out.println(methodsArray2[i]);
		}
		Constructor<User> userCons = userClazz.getConstructor(String.class,String.class,Integer.class,String.class);
		User user2 = userCons.newInstance("zhang","male",18,"北京大学");
		Method schoolMethod  = userClazz.getDeclaredMethod("setSchool", String.class);
		schoolMethod.invoke(user2, "清华大学");
		Method getSchoolMethod  = userClazz.getDeclaredMethod("getSchool", null);
		System.out.println(getSchoolMethod.invoke(user2, null));
	}

}
