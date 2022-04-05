package keyword;
//final关键词修饰局部变量
public class FinalBasicTwo {
	public static void main(String[] args) {
		final int NUM=10;	//基本类型 是值不能被改变
		System.out.println(NUM);
		final s820 s=new s820("成周周",16);
		//引用类型 是地址值不能被改变 对象中的属性可以改变
		//s=new keyword.s820("*zz",17)
		s.setname("*zz");
		s.setage(17);
		System.out.println(s.getname()+"this year is"+s.getage());
		//方法外 每次会弹栈释放 所以每次打印都不同
		mathod(10);
		mathod(100);
	}
	//意义不大 开发中很少这么用
	public static void mathod(int x){
		System.out.println(x);
	}
}
class s820{
	private String name;
	private int age;
	public s820(){
		
	}
	public s820(String name,int age){
		this.name=name;
		this.age=age;
	}
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
}
