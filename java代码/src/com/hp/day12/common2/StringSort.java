package com.hp.day12.common2;

/**
 * 给定一个字符串数组{"nba","abc","cba","zz","qq","haha"}，请按照字典顺序进行从小到大的排序。
 * 
 * @author HP
 *
 */
public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringArray = { "nba", "abc", "cba", "zz", "qq", "haha" };
		/**
		 * 两两比较，每一轮比较能确定一个最大最小值--for循环嵌套 两两比较如何比较？compareTo，==0表示相等，>0表示前面的大
			普通方法和静态方法：
			1.普通方法，没有static修饰，调用时，需要创建对象，通过对象.方法调用
			  在同一类中，普通方法可以相互调用，静态方法不能直接访问普通方法
			2.静态方法，static修饰，类名.方法名，如果在本类中，直接方法名即可
			在静态方法中，不能调用普通方法
		 */
		StringSort ss = new StringSort();
		ss.arraySort(stringArray);
		ss.printArray(stringArray);
	}
	
	/**
	 * 数组打印
	 * @param stringArray
	 */
	public void printArray(String[] stringArray){
		if (null == stringArray || stringArray.length < 1) {
			System.out.println("数组为null,或数组为空~");
			return;
		}
		/**
		 * System.out.println--输出+换行
		 * System.out.print--输出不换行
		 */
		for(int i=0;i<stringArray.length;i++)
			System.out.print(stringArray[i]+" ");
	}

	/**
	 * 对数组排序
	 * @param stringArray
	 */
	public void arraySort(String[] stringArray) {
		if (null == stringArray || stringArray.length < 1) {
			System.out.println("数组为null,或数组为空~");
			return;
		}
		/**
		 * 外层循环，每次循环求出剩余数的最大值
		 * 内层循环，从第0个数开始和后面的数比较--已经比较的值不用参加比较
		 */
		for (int i = 0; i < stringArray.length - 1; i++) {
			/**
			 * 数组长度是6
			 * 第M次循环+存放的位置N+1=数组的长度
			 * 第0次 放到5
			 * 第1次 放到4
			 * 第2次 放到3
			 * 每次循环0~数组长度-循环次数-1
			 */
			for (int j = 0; j < stringArray.length-1-i; j++) {
				if (stringArray[j].compareTo(stringArray[j+1]) > 0) {
					String temp = stringArray[j];
					stringArray[j] = stringArray[j+1];
					stringArray[j+1] = temp;
				}
			}
		}
		
//		this.printArray(stringArray);
	}

}
