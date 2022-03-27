package duotai;

public class 程序905多态SuperMan{
	public static void main(String[] args) {
	Person s=new superman();	//父类对象子类引用
	s.business();	//编译看左边(父类)	运行看右边(子类) 动态绑定
	System.out.println(s.name);
//	s.fly();//现在为父类,虚拟机现在看的是父类 父类中没有fly 所以说是无法运行的
	//((superman) s).fly();
	}
}
class Person{				//父类
	String name="Tesko";	//成员变量
	public void business(){	//成员方法
		System.out.println("Talk business ");
	}
}
class superman extends Person{
	public void business(){
		System.out.println("Talk army business for millions$");
	}
	public void fly(){
		System.out.println("Pants out and fly to help people");
	}
}