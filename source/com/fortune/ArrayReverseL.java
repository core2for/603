package com.fortune;
/*File: ArrayReverseL.java
 *倒置数组
*/
import java.util.Scanner;

public class ArrayReverseL {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");
		double[] arr = new double[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextDouble();
		}
		//逆序数组
		reverse(arr);
		for (int i = 0; i < arr.length; i++ ) {
			System.out.println(arr[i]);
		}
		System.out.println("-------------");
		reverse2(arr);
		for (int i = 0; i < arr.length; i++ ) {
			System.out.println(arr[i]);
		}
		
	}
	/** 倒置数组
		明确一：返回类型void
		明确二：参数类型：int[] arr	
	*/
		//方式一：
	public static void reverse(double[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			double temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}
	//方式二：
	public static void reverse2(double[] arr) {
		for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
			double temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
}