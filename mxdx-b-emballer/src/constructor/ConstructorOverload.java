package constructor;
//构造方法的重载以及注意事项
public class ConstructorOverload {
	public static void main(String[] args) {
	people p1=new people();
	p1.show();
	System.out.println("__________________________");
	people p2=new people("Lliy",29);
	p2.show();
	}
}
class people{
	private String name;
	private int age;
	public people(){
		System.out.println("空参的构造");
	}
	public people(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("有参的构造");
	}
	public void show(){
		System.out.println(name+"..."+age);
	}
}
