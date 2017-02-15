package com.fortune;
/**File: ArrayAverageL.java
  *求数组的平均值
  */
import java.util.Scanner;
public class ArrayAverageL {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers of double class: ");
		double[] array = new double[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		//System.out.println("The average of ten numbers is：" + average(array));
		System.out.println("The average of ten numbers is：" + average(array));
	}
	public static int average(int[] array) {
		int average = 0;
		for (int i = 1; i < array.length; i++) {
			array[0] += array[i];
		}
		average = (int)(array[0] / array.length);
		return average;
	}
	public static double average(double[] array) {
		double average = 0;
		for (int i = 1; i < array.length; i++) {
			array[0] += array[i];
		}
		average = array[0] / array.length;
		return average;
	}
}