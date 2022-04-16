package binterface;

public class 程序916接口的概述 {
	public static void main(String[] args) {
		//jeiko s=new jieko();				//接口不能被实例化,因为调用抽象方法没有意义
		jeiko s=new jiezhe();				//父类引用指向子类对象 //编译看父 运行看子	
		s.eat();							//接口的实例化引用多态的方式进行
	}
}
interface jeiko{
	public abstract void eat();			//接口中的方法都是抽象的
}
class jiezhe implements jeiko{			//可以定义为抽象类但是意义不大
	public void eat(){
		System.out.println("all of us like eat ");
	}	
}
