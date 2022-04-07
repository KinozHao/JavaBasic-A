package sitest;
/**
 * @apiNote 关于超人的小练习
 * */


public class SupermanView {
	public static void main(String[] args) {
		Person s=new superman();	//父类对象子类引用
		s.business();
		//弊端 不能使用子类自己的属性/方法
		//s.fly();
		((superman) s).fly();	//向上转型
	}
}
class Person{
	String name="Teaks";
	public void business(){
		System.out.println("Talk business ");
	}
}
class superman extends Person{
	public void business(){
		System.out.println(name+" Talk army business for millions$");
	}
	public void fly(){
		System.out.println("Pants out and fly to help people");
	}
}