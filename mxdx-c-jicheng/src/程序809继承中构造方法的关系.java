//父类在前子类在后
public class 程序809继承中构造方法的关系 {
	public static void main(String[] args) {
		rabbit s=new rabbit();
	}

}
class animal extends Object{	//父类默认继承Object类
	public animal(){
		super();	//这个super继承的就是Object类
		System.out.println("父类");
	}
}
class rabbit extends animal{
	public rabbit(){
		super();		//这是一条语句,如果不写,系统默认加上,用来访问父类中的空参构造
		System.out.println("子类");
	}
}