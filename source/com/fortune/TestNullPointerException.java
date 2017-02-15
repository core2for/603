package com.fortune;
/**File: TestNullPointerException.java
  */
public class TestNullPointerException {
	private String text;
	public TestNullPointerException(String s) {
		String text = s;
	}
	public static void main(String[] args) {
		TestNullPointerException testt = new TestNullPointerException("ABC");
		System.out.println(testt.text.toLowerCase());	//此处text空指针异常
	}
}