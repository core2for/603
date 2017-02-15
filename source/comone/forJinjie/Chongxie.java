package comone.forJinjie;

class Phone {
	public void call(String name) {
		System.out.println("给" + name + "打电话");
	}
}
class NewPhone extends Phone {
	public void call(String name) {
		super.call(name);
		System.out.println("可以听天气预报了");
	}
}
public class Chongxie {
	public static void main(String[] args) {
		NewPhone np = new NewPhone();
		np.call("张三");
	}
}