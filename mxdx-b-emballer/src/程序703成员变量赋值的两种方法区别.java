public class 程序703成员变量赋值的两种方法区别 {

	public static void main(String[] args) {
		persons a=new persons("CzZ",19);//新建一个对象，并对有参构造进行赋值姓名和年龄
		a=new persons("成周周",16);//<1>替换法,使用后上面的变量直接变垃圾了,这种不推荐使用
		System.out.println(a.getname()+"..."+a.getage());
		persons b=new persons();//无参构造通过成员变量的第二种方法setxxx getxx 进行对其赋值
		b.setage(199);  //设置年龄
		b.setname("koko");//设置姓名
		b.setname("coco");//<2>替换法，这种推荐使用
		System.out.println(b.getname()+"..."+b.getage());
	}

}
class persons{
	private String name;
	private int age;
	public persons(){}//无参构造
	public persons(String name,int age){//有参构造
		this.name=name;
		this.age=age;
	}
	public void setage(int age){//设置年龄
		this.age=age;
	}
	public int getage(){//返回年龄值
		return age;
	}
	public void setname(String name){//设置姓名
		this.name=name;
	}
	public String getname(){//返回年龄值
		return name;
	}
}
