package classmembers;

public class CbkInterview {
	static{
		//静态代码块优先于主方法执行
		System.out.println("静态代码块");
	}
	public static void main(String[] args) {
		System.out.println("Main方法输出");
		Student s1=new Student();
		Student s2=new Student();
	}

}
class Student {
	static{
		System.out.println("Students 静态代码块");
	}
	{
		System.out.println("Students 构造代码块");
	}
	public Student(){
		System.out.println("Students 构造方法");
	}
}