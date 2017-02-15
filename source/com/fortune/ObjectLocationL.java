package com.fortune;
/**File: ObjectLocationL.java
  */
import java.util.Scanner;

public class ObjectLocationL {
	private int row;
	private int column;
	private double maxValue;

	public ObjectLocationL() {

	}
	public static ObjectLocationL locateLargest(double[][] a) {
		ObjectLocationL location = new ObjectLocationL();
		//查找二维数组中的最大值

		location.maxValue = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (location.maxValue < a[i][j]) {
					location.maxValue = a[i][j];
					location.row = i;
					location.column = j;
				}
			}
		}
		return location;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array: ");
		int arrRow = input.nextInt();
		int arrCol = input.nextInt();
		double[][] arr = new double[arrRow][arrCol];
		//初始化数组
		System.out.println("Enter the array:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = input.nextDouble();
			}
		}
		ObjectLocationL testLocation = ObjectLocationL.locateLargest(arr);
		System.out.println("The location of the largest element is " + testLocation.maxValue + " at (" + testLocation.row + ", " + testLocation.column + ")");
	}
}