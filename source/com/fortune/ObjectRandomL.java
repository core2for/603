package com.fortune;
/**File: ObjectRandomL.java
  *Random类
  */
import java.util.Random;
public class ObjectRandomL {
	public static void main(String[] args) {
		Random random = new Random(1000);
		for (int i = 0; i < 50; i++) {
			System.out.print(" " + random.nextInt(100));
		}
	}
}