package comone.forJinjie;

/*
	String和StringBuffer的相互转换

*/

public class StringBufferDemo {
	public static void main(String[] args) {
		String s = "hello";
		//注意：不能把字符串的值直接赋值给StringBuffer
		//方式一：通过构造方法
		StringBuffer sb = new StringBuffer(s);
		//方式二：通过append()方法
		StringBuffer sb2 = new StringBuffer();
		sb2.append(s);
		//StringBuffer ---> String
		//
		StringBuffer buffer = new StringBuffer("java");
		//方式一：通过构造方法
		String str = new String(buffer);
		//方式二：通过toString()方法
		String str2 = buffer.toString();
	}
}