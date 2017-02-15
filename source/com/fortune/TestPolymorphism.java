package com.fortune;
/**File: TestPolymorphism.java
  */
public class TestPolymorphism {
	public static void main(String[] args) {
		Integer[] list1 = {12, 25, 55, 1};
		Double[] list2 = {12.5, 25.1, 55.2, 1.0};
		int[] list3 = {1, 2, 3};
		printArray(list1);
		/*printArray(list2);
		printArray(list3);*/
	}
	public static void printArray(Object list) {
		for (Object[] o: list)
			System.out.print(o + " ");
		System.out.println();
	}
}