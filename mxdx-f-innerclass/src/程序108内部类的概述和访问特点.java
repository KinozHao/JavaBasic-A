public class 程序108内部类的概述和访问特点 {
	public static void main(String[] args) {
		outer.inter oi=new outer().new inter();//创建内部类对象
		oi.method();				//方法调用
	}
}
class outer{	//外部类
	public static final int NUM=10;	//被final修饰的常量
	class inter{	//内部类
		public void method(){		//内部类方法
			System.out.println(NUM);
			System.out.println("Hello word");
		}
	}
}
