package com.fortune;
/**File: ArrayMinSubscriptL.java
  *找出最小元素的下标
  */
import java.util.Scanner;
public class ArrayMinSubscriptL {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");
		double[] numbers = new double[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)((Math.random() * 100) * 100) / 100.0;
			System.out.println();
			System.out.print(numbers[i] + " ");
		}
		System.out.println("The index of smallest element is: " + indexOfSmallestElement(numbers));
	}
	public static int indexOfSmallestElement(double[] array) {
		int index = 0;
		double minNumberOfArray = array[0];
		for (int i = 0; i < array.length; i++) {
			if (minNumberOfArray > array[i]) {
				minNumberOfArray = array[i];
				index = i;
			}
		}
		return index;
	}
}