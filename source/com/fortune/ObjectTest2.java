package com.fortune;
/**:File: ObjectTest2.java
  *测试this关键字
  */
public class ObjectTest2 {
	private int p;
	public ObjectTest2() {
		//System.out.println("C's no-arg constructor invoked");
		this(0);
	}
	public ObjectTest2(int p) {
		p = p;
	}
	public void setP(int p) {
		p = p;
	}
	public static void main(String[] args) {
		ObjectTest2 test = new ObjectTest2();
		test.setP(2);

	}
}