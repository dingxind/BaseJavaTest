package com.hp.day10.interfac;

/**
 * 接口的应用场景：
 * 1.具体实现没想好，或者无法统一实现
 * 2.从项目开发流程上：
 * 	a.需求分析
 * 	b.系统设计--概要设计，详细设计
 * 		概要设计--流程，数据库设计等
 * 		详细设计--接口设计，详细流程
 * 		在开发前，让所有开发人员有一个统一的认识，按照这个规范来
 *  c.代码开发--迭代，敏捷式开发
 *  d.测试
 * @author HP
 *
 */
public interface Runnable {
	public abstract void run();
}
