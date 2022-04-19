public class 程序115匿名内部类开发运用 {
	public static void main(String[] args) {
		persondemo aaa=new persondemo();
		//匿名内部类当作参数传递(本质把匿名内部类看作一个对象)
		aaa.print(new person(){			//pirnt传参数里面是一个匿名内部类
			public void method(){		//new person(){};是实现父类抽象方法
				System.out.println("这是一个method方法");
			}
		});
	}
}
abstract class person{	//这是一个抽象类
	public void method(){};	//抽象方法
}	
class persondemo{
	public void print(person a){	//用print方法调用抽象类的抽象方法
		a.method();
	}
}