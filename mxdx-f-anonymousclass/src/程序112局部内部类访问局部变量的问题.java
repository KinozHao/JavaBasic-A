public class 程序112局部内部类访问局部变量的问题 {
	public static void main(String[] args) {
		ones x= new ones();
		x.method();
	}
}
//局部内部类,只能在其所在的方法中访问
class ones{
	public void method(){	//method方法里面包含了一个twice类 
		final int NUM=100;	//final最终 NUM就成为了一个常量
		class twice{
			public void print(){
				System.out.println(NUM);
				System.out.println("Hello world");
			}
		}
		twice s= new twice();	//在方法内创建新对象
		s.print();
	}
}
