package comone.forJinjie;

abstract class Animal {
	private String name;
	private int age;
	public Animal() {}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public abstract void eat();

}
class Dog extends Animal {
	public Dog() {}
	public Dog(String name, int age) {
		super(name, age);
	}
	public void eat() {
		System.out.println("狗吃肉");
	}
}
class AbstractDemo {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.setName("减肥");
		d.setAge(30);
		System.out.println(d.getName() + "  " + d.getAge());
	}
}