package codeblock;

public class CodeBlockBasic {
	public static void main(String[] args) {
		{
			int x=10;
			System.out.println(x);
		}
		//以上就是一个局部代码块 若打印语句在括号外就无法正常运行,和for语句类似.
		a s=new a();
		System.out.println("------");
		a s2=new a("zhangsan",23);
		System.out.println("------");
		a s3=new a();
		System.out.println("------");
		a s4=new a("zhangsan",23);
	}
	static{
		System.out.println("我是静态代码块尔");//优先于主方法执行
	}
}
class a{
	private String name;
	private int age;
	public a(){
		System.out.println("空参构造");
	}//空参构造
	public a(String name,int age){//有参构造
		this.name=name;
		this.age=age;
		System.out.println("有参构造");
	}
	//setxxx getxx方法
	public void setname(String name){
		this.name=name;
	}
	public String getname(){
		return name;
	}
	public void setage(int age){
		this.age=age;
	}
	public int getage(){
		return age;
	}
	{
		study(); //构造代码块执行study()方法既可以每次出现在最上方，无需以此调用多次.
	}
	public void study(){
		System.out.println("学生学习");
	}
	//静态代码块
	static{//随着类的加载而加载,且只执行一次
		System.out.println("我是静态代码块儿");//作用:用来给类进行初始化,一般用来加载驱动
	}

}