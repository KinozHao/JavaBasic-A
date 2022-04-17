import org.junit.Test;

/**
 * @author kinoz
 * @date 2022年4月16日21点55分
 * @apiNote 抽象的基本使用
 */

public class AbstractBasic {
	@Test
	public void abstractTest() {
		//抽象类不能直接实例化，一般都是用子类方法去实现
		aHuman aHuman = new Freshman("陈子杨", 19);
		System.out.println(aHuman);
		aHuman.eat();
		aHuman.learn();
	}

	@Test
	public void anonymousUs(){
		//匿名类的使用
		aHuman aa = new aHuman() {
			@Override
			public void eat() {
				System.out.println("建筑工人多吃肉有力气干活");
			}

			@Override
			public void learn() {
				System.out.println("建筑工人学习土木知识");
			}
		};
		anony(aa);
		System.out.println("--------------------------------");
		//即是匿名类又是匿名对象
		anony(new aHuman() {
			@Override
			public void eat() {
				System.out.println("电器工人多吃肉有力气干活");
			}

			@Override
			public void learn() {
				System.out.println("电器工人学习CAD和工业知识");
			}
		});

	}

	//多态在方法的体现
	public void anony(aHuman aHuman){
		aHuman.eat();
		aHuman.learn();
	}
}

 abstract class aHuman{
	String name;
	int age;
	public aHuman(){

	}
	//抽象类自己无法实例化对象，但是子类可能需要使用父类的构造器
	public aHuman(String name,int age){
		this.name = name;
		this.age = age;
	}

	//抽象方法没有方法体
	public abstract void eat();
	public abstract void learn();

	@Override
	public String toString() {
		return "Freshman{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}

class Freshman extends aHuman{
	//父类虽然是abstract但是子类仍可以使用父类的构造器
	public Freshman(String name,int age){
		super(name,age);
	}

	//若父类是构造方法，子类必须重写父类的构造方法
	@Override
	public void eat() {
		System.out.println("学生不愁吃，不愁喝。");
	}

	@Override
	public void learn() {
		System.out.println("大一新生不用学习，往死去玩！！");
	}

}

class Worker extends aHuman{
	public Worker(){

	}
	public Worker(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {

	}

	@Override
	public void learn() {

	}
}