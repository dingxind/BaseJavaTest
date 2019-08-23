package com.hp.day12.common2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeAquire {

	public static void main(String[] args) {
		/**
		 * 第一种
		 */
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("当前时间：" + sdf.format(date));

		/**
		 * 第二种
		 */
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("当前时间2:" + sdf2.format(System.currentTimeMillis()));

		/**
		 * 第三种
		 */
		Calendar calendar = Calendar.getInstance();
		System.out.println("年份:" + calendar.get(Calendar.YEAR));
		System.out.println("月份:" + (calendar.get(Calendar.MONTH) + 1));
		System.out.println("天"+calendar.get(Calendar.DATE));
	}

}
