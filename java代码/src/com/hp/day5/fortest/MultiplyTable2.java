package com.hp.day5.fortest;

/**
 * run模式可以直接运行处结果
 * debug模式可以观察到中间过程
 * 可以在行号左侧双击，打蓝色的点，称为断点。如果断点不需要，在断点上双击，可以去掉
 * debug模式运行后，从程序入口开始执行
 * 遇到第一个断点，暂停，暂停的行背景色绿色，此行没有运行
 * 可以把鼠标放到变量上，可以观察中间过程的值
 * 可以按F6（有些笔记本可能是FN+F6）可以执行一行代码
 * 如果中间过程观察完毕，后续不需要再一行一行执行：
 * 1.把断点去掉，双击某个断点
 * 2.可以在debug透视图，让断点失效或者移除某个断点
 * 3.可以按F8，断点之间的跳转，如果断点后没有断点了，则会一直运行到程序结束
 * 断点打到哪个位置？
 * 断点打到想观察的位置
 * @author HP
 *
 */
public class MultiplyTable2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			//j<=i
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}

}
