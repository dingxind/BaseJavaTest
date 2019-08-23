package com.hp.day14.exception;

/**
 * 单选题类 这种类称为实体类，po,pojo,javabean
 * 
 * @author yangzhen
 */
public class Question {
	// 试题唯一标识号
	private int id;
	// 题干
	private String content;
	private String choiceA;
	private String choiceB;
	private String choiceC;
	private String choiceD;
	private String answer;

	public Question() {

	}

	public Question(int id, String content, String choiceA, String choiceB, String choiceC, String choiceD,
			String answer) {
		this.id = id;
		this.content = content;
		this.choiceA = choiceA;
		this.choiceB = choiceB;
		this.choiceC = choiceC;
		this.choiceD = choiceD;
		this.answer = answer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getChoiceA() {
		return choiceA;
	}

	public void setChoiceA(String choiceA) {
		this.choiceA = choiceA;
	}

	public String getChoiceB() {
		return choiceB;
	}

	public void setChoiceB(String choiceB) {
		this.choiceB = choiceB;
	}

	public String getChoiceC() {
		return choiceC;
	}

	public void setChoiceC(String choiceC) {
		this.choiceC = choiceC;
	}

	public String getChoiceD() {
		return choiceD;
	}

	public void setChoiceD(String choiceD) {
		this.choiceD = choiceD;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
