package com.hp.day11.array;

/**
 * 获取数组的最值
 * 
 * @author HP
 */
public class ExtreamValue {

	/**
	 * 求数组的最大值
	 * 
	 * @param array数组
	 */
	public int max(int array[]) {
		if (null == array || array.length < 1) {
			System.out.println("数组不存在");
			return -1000;
		}
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i]>max)
				max= array[i];
		}
		return max;
	}
	
	/**
	 * 求数组的最小值
	 * @param array
	 * @return
	 */
	public int min(int array[]) {
		if (null == array || array.length < 1) {
			System.out.println("数组不存在");
			return -1000;
		}
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i]<min)
				min= array[i];
		}
		return min;
	}

	public static void main(String[] args) {
		int a[] = new int[] { 10, 8, 20, 7, 3, 6, 15, 0, -2, 30 };
		ExtreamValue ev = new ExtreamValue();
		System.out.println("数组的最大值是："+ev.max(a));
		System.out.println("数组的最小值是："+ev.min(a));
		
	}

}
