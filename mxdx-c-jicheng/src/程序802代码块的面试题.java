public class 程序802代码块的面试题 {
	static{
		System.out.println("程序802 静态代码块");//静态代码块优先于主方法执行
	}
	public static void main(String[] args) {
		System.out.println("我是main方法");
		studentss s1=new studentss();
		studentss s2=new studentss();
	}

}
class studentss{
	static{
		System.out.println("Students 静态代码块");
	}
	{
		System.out.println("Students 构造代码块");
	}
	public studentss(){
		System.out.println("Students 构造方法");
	}
}