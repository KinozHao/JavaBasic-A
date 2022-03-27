package constructor;

public class StudentTest {
	public static void main(String[] args) {
		student c=new student();//无参构造
		c.getname("Lily");//设置名字
		c.getage(18);//设置年龄
		System.out.println(c.setname()+"...."+c.setage());
		student c2=new student("Lliy",19);
		c2.show();
	}

}
class student{
	private String name;
	private int age;
	public student(){//无参构造
		
	}
	public student(String name,int age){//有参构造
		this.age=age;	//赋值 this区分成员变量和局部变量
		this.name=name;
	}
	public void getname(String name){//设置名字
		this.name=name;
	}
	public String setname(){
		return name;
	}
	public void getage(int age){//设置年龄
		this.age=age;
	}
	public int setage(){
		return age;
	}
	public void show(){//展示语句
		System.out.println(name+"..."+age);
	}
}
