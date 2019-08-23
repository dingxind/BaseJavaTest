package com.hp.day11.array;

public class ArrayReverse {

	/**
	 * 数组逆序: 第0个和最后一个相交换，第1个和倒数第二个相交换。。。 大小是10数组，下标0和9交换，下标1和8交换 相加再加1正好是数组长度
	 * 如果是偶数个，正好够换的 如果奇数个，换多少？换数组的长度/2
	 * 
	 * @param array
	 */
	public void reverse(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int temp = 0;
			temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
	}

	/**
	 * 打印数组
	 * @param array
	 */
	public void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}

	public static void main(String[] args) {
		int a[] = new int[] { 10, 8, 20, 7, 3, 6, 15, 0, -2, 30 };
		ArrayReverse ar = new ArrayReverse();
		ar.reverse(a);
		ar.printArray(a);
	}

}
