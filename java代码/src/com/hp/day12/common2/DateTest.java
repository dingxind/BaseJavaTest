package com.hp.day12.common2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		//date无参构造方法可以获得系统当前时间
		Date date = new Date();
		System.out.println("当前的日期是："+date);
		System.out.println("当前时间的毫秒数（通过date获取）:"+date.getTime());
		/**
		 * 为1970年1月1日0时0分0秒开始，到程序执行取得系统时间为止所经过的毫秒数 1秒＝1000毫秒
		 */
		System.out.println("当前时间的毫秒数："+System.currentTimeMillis());
		
		//日期格式定义
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String formateDate = sdf.format(date);
		System.out.println(formateDate);
	}

}
