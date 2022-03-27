/**
 * @author kinoz
 * @date 2022/3/27 - 21:19
 * @apiNote 属性赋值的两种方法区别
 */
package constructor;

public class DifferentSgAndConstructor {

	public static void main(String[] args) {
		//用构造器
		persons a=new persons("CzZ",19);//新建一个对象，并对有参构造进行赋值姓名和年龄
		a=new persons("成周周",16);//<1>替换法,使用后上面的变量直接变垃圾了,这种不推荐使用
		System.out.println(a.getname()+"..."+a.getage());

		//用set get方法
		persons b=new persons();//无参构造通过成员变量的
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
