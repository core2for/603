package comone.forJinjie;
/*
	一个标准代码的最终版

	学生类：
		成员变量：
			name，age
		构造方法：
			无参，带两个参数
		成员方法：
			getXxx() / setXxx()
			show():输出该类的所有成员变量值
*/
class Student2 {
	//姓名：
	private String name;

	private int age;

	public Student2() {

	}
	public Student2(String name, int age) {
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

	public void show() {
		System.out.println(name + "------" + age);
	}
}
public class StudentDemo2 {
	public static void main(String[] args) {
		Student2 s1 = new Student2();
		s1.setName("张三");
		s1.setAge(34);
		//输出值
		System.out.println(s1.getName() + "----" + s1.getAge());
		s1.show();

		Student2 s2 = new Student2("话说", 45);
		s2.show();
	}
}