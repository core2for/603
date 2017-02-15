/*
	教练和运动员案例
		兵乓球运动员和篮球员动员。
		兵乓球教练和篮球教练。
		为了出国交流，跟兵乓球相关的人员都需要学习英语


*/
//定义一个说英语的接口
interface SpeakEnglish {
	public abstract void speak();
}
//定义人的抽象类
abstract class Person {
	private String name;
	private int age;

	public Person() {}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//getXxx()/setXxx()

	public abstract void eat() {

	}
	public void sleep() {
		System.out.println("人都要睡觉");
	}
}
///定义教练抽象类
abstract class Coach extends Person{
	public Coach() {}

	public Coach(String name, int age) {
		super(name, age);
	}
	public abstract void teach() {

	}
}
//定义运动员抽象类
abstract class Player extends Person{
	public Player() {}

	public Player(String name, int age) {
		super(name, age);
	}
	public abstract void study() {

	}
}
//定义乒乓球运动员具体类
class PingPangqPlayer extends Player implements SpeakEnglish {
	public PingPangqPlayer() {}

	public PingPangqPlayer(String name, int age) {
		super(name, age);
	}

	//吃
	public void eat() {
		System.out.prinltn("吃大白菜");
	}

	//学习
	public void study() {
		System.out.println("学习发球");
	}
	public void speak() {
		System.out.println("说英语");
	}
}
//定义篮球球运动员具体类
class BasketballPlayer extends Player{
	public BasketballPlayer() {}

	public BasketballPlayer(String name, int age) {
		super(name, age);
	}

	//吃
	public void eat() {
		System.out.prinltn("吃大白菜");
	}

	//学习
	public void study() {
		System.out.println("学习运球");
	}
}
//定义乒乓球教练具体类
class PingPangqCoach extends Coach implements SpeakEnglish {
	public PingPangqCoach() {}

	public PingPangqCoach(String name, int age) {
		super(name, age);
	}

	//吃
	public void eat() {
		System.out.prinltn("吃大白菜");
	}

	//学习
	public void teach() {
		System.out.println("教发球");
	}
	public void speak() {
		System.out.println("说英语");
	}
}
//定义篮球球教练具体类
class BasketballCoach extends Coach{
	public BasketballCoach() {}

	public BasketballCoach(String name, int age) {
		super(name, age);
	}

	//吃
	public void eat() {
		System.out.prinltn("吃大白菜");
	}

	//学习
	public void teach() {
		System.out.println("教运球");
	}
}
class InterfaceDemo2 {
	public static void main(String[] args) {
		PingPangqPlayer ppp = new PingPangqPlayer();
		ppp.setName("王浩");
		ppp.setAge(33);

		ppp.eat();
		ppp.sleep();
		ppp.study();
	}
}