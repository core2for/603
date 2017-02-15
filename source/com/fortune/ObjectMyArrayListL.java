package com.fortune;
import java.util.ArrayList;
/**File: ObjectMyArrayListL.java
  */
import java.util.Scanner;

public class ObjectMyArrayListL {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	}
	public int Integer max(ArrayList<Integer> list) {
		if (list.size() == 0) {
			return null
		}
		int max = list.get(0);
		for (Integer i : list) {
			if (max < list.get(i))
				max = list.get(i);
		}
	}
}