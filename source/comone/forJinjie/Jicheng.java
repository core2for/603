package comone.forJinjie;

class Father {
	/*public Father() {
		System.out.println("Father的无参构造方法");
	}*/
	public Father(String name) {
		System.out.println("Father的有参构造方法");
	}
}
class Son extends Father {
	public Son() {
		super("随便给");
		System.out.println("Son的无参构造方法");
	}
	public Son(String name) {
		this();
		System.out.println("Son的有参构造方法");
	}
}
public class Jicheng {
	public static void main(String[] args) {
		Son s1 = new Son();
		System.out.println();
	}
}