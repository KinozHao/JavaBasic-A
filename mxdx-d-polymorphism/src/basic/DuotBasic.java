package basic;

/**
 * @apiNote
 * 多态的前提	要有继承和方法重写以及父类引用指向子类对象
 * 父类名称 父类变量名字=new 子类名称();
 */

public class DuotBasic {
	public static void main(String[] args) {
		Cat min = new Cat();
		min.eat();

		//方法：编译看左，运行看右
		Ainmals als = new Cat();//父类引用指向子类对象
		als.eat();

		//属性：遍历和运行都是左边
		System.out.println(als.leg);

		if (als instanceof Cat){	//向下转型
			Cat ct = (Cat)als;
			System.out.println("猫只有"+ct.leg+"条腿");
		}
	}
}

class Ainmals {
	int leg = 88;
	public void eat(){
		System.out.println("Animals eats food");
	}
}
class Cat extends Ainmals {
	int leg = 4;
	public void eat(){
		System.out.println("Cat eats fish");
	}
}
