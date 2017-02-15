package comone.forJinjie;
/*
	String类的获取功能
		int length():获取字符串的长度
		char charAt(int index): 获取指定索引位置的字符
		int indexOf(int ch):返回指定字符串在此字符串中第一次出现处的索引
		int indexOf(String str):返回指定字符串在此字符串中第一次出现处的索引
		int indexOf(int ch, int fromIndex):返回指定字符串在此字符串中从指定位置后第一次出现处的索引
		int indexOf(String str, int fromIndex):返回指定字符串在此字符串中从指定位置后第一次出现处的索引
		String substring(int start):从指定位置开始到指定位置结束截取字符串,默认到末尾
		String substring(int start, int end):从指定位置开始到指定位置结束截取字符串
*/
public class StringDemo3 {
	public static void main(String[] args) {
		String s  = "helloworld";
		System.out.println(s.indexOf('l', 2));
	}
}