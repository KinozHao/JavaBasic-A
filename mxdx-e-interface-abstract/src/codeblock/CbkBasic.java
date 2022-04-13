package codeblock;

public class CbkBasic {
	//1 静态代码块 优先于主方法执行
	static{
		System.out.println("静态代码块，一直是在控制台的最顶层！！！！！");
	}
	public static void main(String[] args) {
		//2 局部代码块 若打印语句在括号外就无法正常运行,和for语句类似
		{
			int x=10;
			System.out.println(x);
		}
		LeiA s=new LeiA();
		System.out.println("------");
		LeiA s2=new LeiA("zhangsan",23);
		System.out.println("------");
		LeiA s3=new LeiA();
		System.out.println("------");
		LeiA s4=new LeiA("zhangsan",23);
	}

}
class LeiA {
	private String name;
	private int age;
	public LeiA(){
		System.out.println("空参构造");
	}
	public LeiA(String name, int age){
		this.name=name;
		this.age=age;
		System.out.println("有参构造");
	}
	//3 构造代码块
	{
		study(); //执行study()方法每次可出现在最上方，无需多次调用
	}
	public void study(){
		System.out.println("学生学习");
	}
	/**
	 * 	静态代码块
	 * 	作用:用来给类进行初始化,一般用来加载驱动
	 * 	随着类的加载而加载,且只执行一次
	 */
	static{
		System.out.println("LeiA类中的static代码块");
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}