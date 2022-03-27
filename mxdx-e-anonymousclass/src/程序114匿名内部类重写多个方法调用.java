//匿名内部类只针对重写一个方法时候使用
//重写多个方法的时候推荐使用创建新对象
public class 程序114匿名内部类重写多个方法调用 {
	public static void main(String[] args) {
		w aaa=new w();
		aaa.print();
	}
}
interface jk2{
	public void method1();
	public void method2();
}
class w{
	class n implements jk2{
		public void method1(){
			System.out.println("这个是方法1");
		}
		public void method2(){
			System.out.println("这个是方法2");
		}
	}
	public void print(){
		new n().method1();	//调用的是子类n的方法
		new n().method2();	//同上解释
	new jk2(){				//实现接口中的method1
		public void method1(){
			System.out.println("这个是方法一在外部类的实现");
		}
		public void method2(){
			System.out.println("这个是方法二在外部类的实现");
		}
		}.method1();
	new jk2(){				//实现接口中的method2
			public void method1(){
				System.out.println("这个是方法一在外部类的实现");
			}
			public void method2(){
				System.out.println("这个是方法二在外部类的实现");
			}
			}.method2();
	}
}
