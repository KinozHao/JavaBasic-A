package ainterface;
/**
 * @author kinoz
 * @date 2022/4/17 - 16:22
 * @apiNote
 * 接口不能被实例化,因为调用抽象方法没有意义
 * 接口的实例化和多态一样
 * 接口中的方法都是抽象的(abstract可以直接省略不写)
 * 实现接口的类可以写为抽象类(也可以不写)
 */
public class InterfaceBasic {
	public static void main(String[] args) {
		Plane plane = new Plane();
		plane.fly();
		plane.stop();
	}
}

interface Flyable{
	//常量 public static final可以省略不写
	int MAX_SPEED = 7200;
	int MIN_SPEED = 1;
	//抽象方法 public abstract可以不写
	void fly();
	void stop();
}

class Plane implements Flyable{
	@Override
	public void fly() {
		System.out.println("通过飞机引擎起飞");
	}

	@Override
	public void stop() {
		System.out.println("操作控制系统停止");
	}
}

//没有全部把接口的方法实现，那这个类就还是个抽象类
abstract class Kite implements Flyable{
	@Override
	public void stop() {
		System.out.println("把它拉下来");
	}
}