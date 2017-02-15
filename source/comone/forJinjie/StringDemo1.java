package comone.forJinjie;
/**
	字符串是一个常量，一旦被赋值，就不能改变
	构造方法：
		public


	
*/
public class StringDemo1 {
	public static void main(String[] args) {
		String s1 = new String();
		System.out.println("s1:" + s1);

		//public String (byte[] bytes)
			byte[] bys = {2, 2, 2, ,2,3};
			String s2 = new String(bys);

		//pubblic String(byte[] int index, int length)
		String s3 = new String(bys, 1, 3);

		//public String(char[] value)
		char[] chs = {'a', 'b', 'c'};
		String s4 = new String(chs);
	}
}