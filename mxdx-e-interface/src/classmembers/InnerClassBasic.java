package classmembers;/*
* 内部类的基本使用
* */

public class InnerClassBasic {
	public static void main(String[] args) {
		//静态实例化
		Human.Brain brain = new Human.Brain();
		brain.bMethod();
		System.out.println("-----------");


		//非静态的实例化
		Human person = new Human();
		Human.Stomach stomach = person.new Stomach();
		stomach.sMethod();
		System.out.println("-----------");
		stomach.display("The Brain");

	}
}
class Human {	//外部类
	String name = "Jack";
	static public void eat(){
		System.out.println("人吃饭");
	}

	//静态内部类
	static class Brain {

		public void bMethod(){
			System.out.println("Hello word");
		}
	}

	//成员内部类
	class Stomach {
		String name ="Rose";
		public void sMethod(){
			System.out.println("Hello word");
			//内部类调用外部类全写
			Human.this.eat();
		}

		public void display(String name){
			//方法的形参
			System.out.println(name);
			//内部类的属性
			System.out.println(this.name);
			//外部类的属性
			System.out.println(Human.this.name);
		}
	}

	//局部内布类
	{
		class a{

		}
	}
	public Human(){
		class b{

		}
	}
	public void methodss(){
		class c{

		}
	}
}
