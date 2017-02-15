package comone.forJinjie;
/*
	可变字符序列
	线程安全：
		安全  ---- 同步     --- 数据是安全的
		不安全---- 不同步   --- 效率高一些


	StringBuffer:
		线程安全的可变字符串序列

	StringBuffer和String的区别：
		String是不可变的

	构造方法：
		public StringBuffer():无参构造方法
		public StringBuffer(int capacity):指定容量的字符串缓冲区对象
		public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
	StringBuffer方法；
		public int capacity():返回当前容量，理论值
		public int length()  :返回长度（字符数）,实际值
*/
public class StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		StringBuffer sb2 = new StringBuffer(50);
		System.out.println(sb2.capacity());
		StringBuffer sb3 = new StringBuffer("hello");
		System.out.println(sb3.capacity());//21---length() + 16
	}
}