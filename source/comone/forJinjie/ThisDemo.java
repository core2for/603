package comone.forJinjie;

class Student {
	private String name;
	private int age;

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
}
public class ThisDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("张三");
		s.setAge(27);
		System.out.println(s.getAge() + s.getName() + "");
	}
}