package com.fortune;
/**File: ArrayPrintNumberL.java
  *打印不同的数
  */
import java.util.Scanner;

public class ArrayPrintNumberL {
	public static void main(String[] args) {
		final int ENTER_OF_NUMBER = 10;
		int count = 0;	//记录不同的数的个数
		int j = 0;	//数组的下标
		int[] zone = new int[ENTER_OF_NUMBER];	//存放不重复的数字
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten number: ");
		for (int i = 0; i < ENTER_OF_NUMBER; i++) {	//循环输入十个数字
			int number = input.nextInt();
			//判断是否重复
			if (judge(number, zone)) {
				zone[j++] = number;
				count++;
			}
		}
		System.out.println("The number of distinct number is " + count);
		System.out.println("The distinct number are: ");
		for (int i = 0; i < j; i++) {
			System.out.print(" " + zone[i]);
		}
	}
	/** 判断输入的数是否重复 */
	public static boolean judge(int number, int[] zone) {
		for (int i = 0; i < zone.length; i++) {
			if (number == zone[i]) {
				return false;
			}
		}
		return true;
	}
}
