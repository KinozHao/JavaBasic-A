package duotai;

public class 程序909抽象类概述和特点 {
	public static void main(String[] args) {
		gosss s=new gohome();	//父类引用指向子类对象
		s.gos();
	}
}
abstract class gosss{	//抽象类
	public abstract void gos();	//抽象方法
}
class gohome extends gosss{
	public void gos(){
		System.out.println("Go ahand this way");
	}
}