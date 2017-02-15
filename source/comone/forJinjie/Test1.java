package comone.forJinjie;
/*
	猫狗案例，加入跳高的额外功能
	分析：从具体到抽象
		猫；
			姓名，年龄
			吃饭，睡觉
		狗：
			姓名，年龄
			吃饭，睡觉
		由于有共性功能，所以，我们抽取一个父类；
		动物：
			姓名，年龄
			吃饭()，
			睡觉(){};
		猫：继承自动物
		狗：继承自动物

		跳高的额外功能是一个新的扩展功能，所以我们定义了一个接口
		接口：
			跳高
		部分猫：实现跳高
	实现：
		从抽象到具体
	使用：
		使用具体类
*/
interface Jumpping {
	public abstract void jump();
}
abstract class Animal {
	private String name;
	private int age;
	public Animal() {}
	//getXxx()/setXxx()
	public abstract void sleep();
	public abstract void eat();
}
class Cat extends Animal {
	public Cat() {}


}

//有跳高功能的猫
class JumpCat extends Cat implements Jumpping {
	public JumpCat() {}
	public void jump() {

	}
}
public class Test {

}