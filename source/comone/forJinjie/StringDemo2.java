package comone.forJinjie;

/*
	判断功能：
		boolean eauals(Object obj):比较字符串的内容是否相同，区分大小写
		boolean equalsIgnoreCase(String str)：比较字符串的内容是否相同，忽略大小写
		boolean contains(String str)：判断大字符串中是否包含小字符串
		boolean startsWith(String str)：判断字符串是否以某个指定的字符串开头
		boolean endsWith(String str)：判断字符串是否以某个指定的字符串结尾
		boolean isEmpty():判断字符串是否为空

		注意：
			字符串内容为空和字符串对象为空
			String s = "";内容为空但是对象存在
			String s = null;对象不存在

*/
/*
	模拟登录：给三次机会，并提示还有几次机会,如果登陆成功，就可以玩游戏（猜数字游戏）

	分析：
		A:定义用户名和密码。已存在的。
		D:键盘录入用户名和密码。
		C:比较用户名和密码。
			如果相同，则登陆成功
			如果有一不同，则登录失败
		D:给三次机会，用循环改进，最好用for循环。

*/

import java.util.Scanner;
//import comone.forJinjie.GuessNumberGame;

public class StringDemo2 {
	public static void main(String[] args) {
		// A:定义用户名和密码。已存在的。
		String username = "admin";
		String password = "admin";

		// D:给三次机会，用循环改进，最好用for循环。
		for (int i = 0; i < 3; i++) {
			// D:键盘录入用户名和密码。
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入用户名");
			String name = sc.nextLine();
			System.out.println("请输入密码：");
			String pwd = sc.nextLine();
			// C:比较用户名和密码。
			if (name.equals(username) && pwd.equals(password)) {
				// 	如果相同，则登陆成功
				System.out.println("登录成功");
				System.out.println("猜数字游戏");
				GuessNumberGame.start();
				break;
			} else {
				// 	如果有一不同，则登录失败
				if ((2 - i) == 0) {
					System.out.println("帐号被锁定。");
				} else {
					System.out.println("登录失败，你还有" + (2 - i) + "次机会");
				}
			}
		}
	}
}