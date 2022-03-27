package duotai;

public class dtbasic {
	public static void main(String[] args) {
	cat x=new cat();
	x.eat();
	dongwu y=new cat();//父类引用指向子类对象
	y.eat();
	}
}
/**
 * Polymorpic的前提	要有inheritance 要有method override 
 * 要有父类引用指向子类对象
 * 父类名称 父类变量名字=new 子类名称();
 */
class dongwu{
	public void eat(){
		System.out.println("Animals eats food");
	}
}
class cat extends dongwu{
	public void eat(){
		System.out.println("Cat eats fishs");
	}
}
