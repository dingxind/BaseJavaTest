package com.hp.day14.exception;

public class TryCatchFinally {

	public static void main(String[] args) {
		/**
		 * 输入的topicId可能不是纯数字或者不符合int类型，或者不符合业务需求（不可能是小于等于0的整数）
		 */
		String topicIdString = "11111111111111111111122222222222222";
		int id = -1;
		try {
			/**
			 * parseInt只抛NumberFormatException，可以直接写
			 * 异常越具体，越方便定位问题
			 */
			id = Integer.parseInt(topicIdString);
		} catch (NumberFormatException e) {
			//如果抛异常--不是纯数字或者不符合int类型
			id = 1;
		} finally {
			//不符合业务需求
			if (id <= 0)
				id = 1;
		}
	}

}
