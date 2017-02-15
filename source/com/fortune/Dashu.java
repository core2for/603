package com.fortune;
import java.util.Scanner;
public class Dashu {
	public static void main(String[] ar) {
		Scanner input = new Scanner(System.in);
		int sum1 = craps();
		if (sum1 == 7 || sum1 == 1) {
			System.out.println("you win");
		}
		else if (sum1 == 2 || sum1 == 3 || sum1 == 12)
			System.out.println("you lose");
		else
			System.out.println("point is " + sum1);
		int sum2 = 0;	
		/*while (sum2 != 7 || sum2 != sum1) {
			sum2 = craps();
			System.out.println("point is " + sum2);
			int a = input.nextInt();
		}
		if (sum2 == 7) 
			System.out.println("you lose");
		else if (sum2 == sum1)
			System.out.println("you win");*/
		while (true) {
				sum2 = craps();
				if (sum2 == 7) {
					System.out.println("you lose");
					break;
				}
				else if (sum2 == sum1) {
					System.out.println("you win");
					break;
				}
				System.out.println("point is " + sum2);
				sum1 = sum2;
		}
	}
	public static int craps() {
		int num1 = (int)(Math.random() * 6 + 1);
		int num2 = (int)(Math.random() * 6 + 1);
		int sum = num1 + num2;
		System.out.println("you rolled " + num1 + " + " + num2 + " = " + sum);
		return sum;
	}
}