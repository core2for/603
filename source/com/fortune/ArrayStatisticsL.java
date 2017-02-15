package com.fortune;
/**File: ArrayStatisticsL.java
  *统计一位数的个数
  */
public class ArrayStatisticsL {
	public static void main(String[] a) {
		int randomNumber = -1;
		int[] counts = new int[10];
		for (int i = 0; i < 100; i++) {
			randomNumber = (int)(Math.random() * 10);
			counts[randomNumber]++;
		}
		for (int i = 0; i < counts.length; i++) {
			System.out.println(i +" 的个数为：" + counts[i]);
		}
	}
}