package comone.forJinjie;

import java.util.Scanner;

public class JiaMiDemo {
	public static void main(String[] args) {
		/*//定义一个数据
		int number = 123456;
		//定一个数组
		int[] arr = new int[8];

		//把数据中每一位上的数据获取到后存储到数组中
		// int index = 0;
		// arr[index] = number % 10;
		// index++;
		// arr[index] = number / 10 % 10;
		// index++;
		// arr[index] = number / 10 / 10 % 10;

		//通过观察这个代码，可以通过循环改进
		int index = 0;
		while (number > 0) {
			arr[index] = number % 10;
			index++;
			number /= 10;
		}
		//将每位数字都加上5，在用和除以10的余数代替该数字
		for (int i = 0; i < index; i++) {
			arr[i] += 5;
			arr[i] %= 10;
		}
		//最后将第一位和最后一位数字交换
		int temp = arr[0];
		arr[0] = arr[index - 1];
		arr[index - 1] = temp;

		//输出数据
		for (int i = 0; i < index; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();*/

		//创建键盘录入对象
		Scanner input = new Scanner(System.in);

		//请输入一个数据
		System.out.print("请输入一个数据（小于8位）：");
		int number = input.nextInt();

		//写功能实现把number进行加密
		String s = jiaMi(number);
		System.out.println("加密后的结果是：" + s);
	}
	/* 把数据number实现加密。

		两个明确：
			返回至类型：String做一个字符串的拼接
			参数列表：int number*/
	public static String jiaMi(int number) {
		//定一个数组
		int [] arr = new int[8];
		//定义索引
		int index = 0;
		//把number中的数据放到数组中
		while (number > 0) {
			arr[index] = number % 10;
			index++;
			number /= 10;
		}
		//把每个数据加5，然后你对10取得余数
		for (int i = 0; i < index; i++) {
			arr[i] += 5;
			arr[i] %= 10;
		}
		//把第一个和最后一个交换
		int temp = arr[0];
		arr[0] = arr[index - 1];
		arr[index - 1] = temp;

		//把数组元素拼接成一个字符串返回
		String s = "";
		for (int i = 0; i < index; i++) {
			s += arr[i];
		}
		return s;
	}
}