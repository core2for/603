package com.fortune;
/**File：ArrayMinNumL.java
  *找出最小元素
  */
import java.util.Scanner;

public class ArrayMinNumL {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");
		double[] num = new double[10];
		for (int i = 0; i < 10; i++) {
			num[i] = input.nextInt();
		}
		System.out.println("The minimum number is: " + min(num));
	}	
	public static double min(double[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[0] > array[i]) {
				double temp = array[0];
				array[0] = array[i];
				array[i] = temp;
			}
		}
		return array[0];
	}
}