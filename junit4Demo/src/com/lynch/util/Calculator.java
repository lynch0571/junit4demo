package com.lynch.util;

/**
 * 被JUnit测试的计算器类
 * 
 * @author lynch
 * 2015年12月7日20:50:11
 *
 */
public class Calculator {
	/**
	 * 加法
	 * @param a
	 * @param b
	 * @return a+b
	 */
	public int add(int a,int b){
		return a+b;
	}

	/**
	 * 减法
	 * @param a
	 * @param b
	 * @return a-b
	 */
	public int sub(int a,int b){
		return a-b;
	} 
	
	/**
	 * 乘法
	 * @param a
	 * @param b
	 * @return a*b
	 */
	public int mul(int a,int b){
		return a*b;
	}
	
	/**
	 * 除法
	 * @param a
	 * @param b
	 * @return a/b
	 */
	public int div(int a,int b){
		return a/b;
	}
}
