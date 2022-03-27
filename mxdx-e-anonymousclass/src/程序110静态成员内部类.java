public class 程序110静态成员内部类 {
	public static void main(String[] args) {
//		新建对象的格式是: 外部类名.内部类名 对象名=new 外部类名.内部类对象();
		j.x a=new j.x();
		a.method();
		j.x2.print();
	}
}
class j{		//外部类
	static class x{	//静态内部类
		public void method(){	//内部类方法
			System.out.println("Hello world");
		}
	}
	static class x2{	//静态内部类
		public static void print(){
			System.out.println("print");
		}
	}
}
