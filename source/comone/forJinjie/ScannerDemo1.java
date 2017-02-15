package comone.forJinjie;

import java.util.Scanner;

public class ScannerDemo1.java {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int x = sc.nextInt();
		} else {
			System.out.println("你输入的数据有误");
		}
	}
}