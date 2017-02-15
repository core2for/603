package comone.forJinjie;

//数据的封装
/*概述：
	是指隐藏对象的属性和实现细节，仅对外提供公共的访问方式
好处：
	隐藏实现细节，提供公共的访问方式
	提高了代码的复用性
	提高了安全性
原则；
	将不需要对外提供的内容都隐藏起来
	把属性隐藏，提供公共方法对其访问。*/
class Student {
	//姓名
	private String name;
	//年龄
	private int age;
	//写一个方法对数据进行校验
	/*
		返回值类型：void
		参数列表：int a
	*/
	public void setAge(int a) {
		if (a < 0 || a > 120)
			System.out.println("有问题");
		} else {
			age = a;
		}
	}
}