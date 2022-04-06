package basic;

/**
 * @apiNote
 * 多态的前提	要有继承和方法重写以及父类引用指向子类对象
 * 父类名称 父类变量名字=new 子类名称();
 */

public class DuotBasic {
	public static void main(String[] args) {
	cat min = new cat();
	min.eat();

	ainmals als = new cat();//父类引用指向子类对象
	als.eat();
	}
}

class ainmals {
	public void eat(){
		System.out.println("Animals eats food");
	}
}
class cat extends ainmals {
	public void eat(){
		System.out.println("Cat eats fishs");
	}
}
