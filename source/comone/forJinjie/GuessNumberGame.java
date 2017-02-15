package comone.forJinjie;

import java.util.Scanner;

public class GuessNumberGame {
	private GuessNumberGame() {

	}
	public static void start() {
		int number = (int) (Math.random() * 100) + 1;
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("请输入你要猜的数字（1-100）：");
			int guessNumber = sc.nextInt();

			//判断
			if (guessNumber > number) {
				System.out.println(guessNumber + "大了");
			} else if (guessNumber < number) {
				System.out.println(guessNumber + "小了");
			} else {
				System.out.println("恭喜你，猜中了！");
				break;
			}
		}
	}
}