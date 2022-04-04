package constructor;
//构造方法的重载
public class Overload {
	public static void main(String[] args) {
		//使用构造器进行传参
		people p = new people("Jim",20);

	}
}
class people{
	private String name;
	private int age;
	//两个构造器就构成了构造器的重载
	public people(){
		System.out.println("空参的构造");
	}
	public people(String names,int ages){
		name = names;
		age = ages;
		System.out.println("有参的构造");
		System.out.println("名字"+name+" 年龄"+age);
	}

}
