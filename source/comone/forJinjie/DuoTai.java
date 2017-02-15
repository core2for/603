package comone.forJinjie;

class Person {
	public void eat() {
		System.out.println("吃饭");
	}
}
class SouthPerson extends Person {
	public void eat() {
		System.out.println("炒菜，吃米饭");
	}
	public void sell() {
		System.out.println("经商");
	}
}
class NorthPerson extends Person {
	public void eat() {
		System.out.println("炖菜，吃馒头");
	}
	public void yanJiu() {
		System.out.println("研究");
	}
}
public class DuoTai {
	public static void main(String[] args) {
		//
		Person p = new SouthPerson();
		p.eat();
		System.out.println("------");
		SouthPerson sp = (SouthPerson)p;
		sp.eat();
		sp.sell();
		System.out.println("------");
		//
		p= new NorthPerson();
		p.eat();
		System.out.println("------");
		NorthPerson np = 

	}
}