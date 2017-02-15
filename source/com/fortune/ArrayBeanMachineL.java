package com.fortune;
/**File: ArrayBeanMachineL.java
  *豆机
  */
import java.util.Scanner;

public class ArrayBeanMachineL {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of balls to drop: ");
		int ballsNumbers = input.nextInt();
		System.out.print("Enter the number of slots in the bean machine: ");
		int slotsNumbers = input.nextInt();
		int[] count = new int[slotsNumbers];	//存放豆
		//输出每个豆的路径
		displayRoad(ballsNumbers, slotsNumbers, count);
		//循环遍历输出五个豆在那个框里面
		displayCount(ballsNumbers, slotsNumbers, count);
	}
	/** beanMachine -- 豆机：模拟钉子，每碰到一个钉就判断他的方向*/
	public static int beanMachine() {
		int a = -2;
		int cord = 0;
			a = (int)(Math.random() * 2);
			if (a == 0)	//落向右边
				cord = 1;
			else 	//落向左边
				cord = -1;
		return cord;
	}
	/** 输出框里免得豆的个数 */
	public static void displayCount(int ballsNumbers, int slotsNumbers, int[] count) {
		int max = count[0];
		//找到存放豆最多的槽
		for (int i = 0; i < count.length; i++) {
			if (max < count[i]) {
				max = count[i];
			}
		}
		//循环遍历输出五个豆在那个框里面
		for (int j = 0; j < max; j++) {
			//循环遍历每个豆的路径，如若落向右边打印“O”，左则是“ ”
			for (int i = 0; i < slotsNumbers; i++) {
				if (count[i] == max  - j/*count[i] >= max - j System....("O");*/) {
					System.out.print("O");
					count[i]--; 
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}	
	}
	/** 输出每个豆的路径 */
	public static void displayRoad(int ballsNumbers, int slotsNumbers, int[] count) {
		/*
		char[] letterRL = {'R', 'L'};
		int index = 0;
		for (int j = 0; j < ballsNumbers; j++) {
			for (int i = 0; i < slotsNumbers - 1; i++) {
				int LOrR = (int)(Math.random() * 2);
				System.out.print(letterRL[LOrR]);
				if (letterRL[num] == 'R') {
					index++;
				}
			}
			count[index]++;
		}
		*/
		int flag = 0;
		for (int i = 0; i < ballsNumbers; i++) {	//每个豆
			flag = 0;
			for (int j = 0; j < slotsNumbers - 1; j++) {	//豆的路径
				int ball = beanMachine();
				if (ball == 1) {
					flag++;
					System.out.print("R");
				}
				else if (ball == -1) 
					System.out.print("L");
				else
					System.out.print("X");
			}
			/*if (flag > 0)*/	//存放豆到槽里
				count[flag] += 1;
			/*else
				count[0] += 1;*/
			System.out.println();
		}
	}
}
