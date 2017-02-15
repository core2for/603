package comone.forJinjie;
/*
	接口特点：
		A:接口用关键字interface表示
			interface 接口名{}
		B:类实现接口用implements 接口名 {}
			class 类名 implements 接口名 {}
		C:接口不能实例化
			那么，接口类如何实例化呢？
			按照多态的方式来实例化。
		D:接口的子类
			a：可以是抽象类。但是意义不大
			b:可以是具体类，要重写接口中的所有抽象方法
	由此可见：
		A:具体类多态（几乎没有）
		B:抽象类多态（常用）
		C:接口多态（最常用）
	接口的成员特点：
		成员变量：只能是常量，并且是静态的
				默认修饰符：public static final
				建议：自己手动给出
		构造方法：接口没有构造方法
		成员方法：只能是抽象方法
				默认修饰符：public abstract
				建议：自己手动给出。


		所有的类都默认继承自object类
*/
interface AnimalTrain {
	public static final int num = 30;
	public abstract void jump();
}
class Dog implements AnimalTrain {
	public void jump() {

	}
}
public class InterfaceDemo {
	public static void main(String[] args) {

	}
}