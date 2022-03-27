package duotai;

public class 程序910抽象类的成员特点 {
	public static void main(String[] args) {
		Demo1 s=new Demo2();
		s.runss();
		s.runs();
	}
}
abstract class Demo1{
	int num1=10;
	final int NUM2=2000;

	public Demo1(){}
	public void runss(){
		System.out.println("Gogogo");
	}
	public abstract void runs();
}
class Demo2 extends Demo1{
	public void runs(){
		System.out.println("restarted");
	}
}