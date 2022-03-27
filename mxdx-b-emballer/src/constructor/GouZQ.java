package constructor;
//什么是构造器
public class GouZQ {

	public static void main(String[] args) {
		//构造器的作用就是创建对象
		Person c=new Person();	//new后面的就是构造器
		//c.Person();		  //构造方法不能用对象调用
		c.runs();
	}

}
class Person{
	//属性
	String name;
	private int age;

	//构造器
	public Person(){
		name="成周洲";
		age=21;
		//有return语句，但可不写
	}

	//方法
	public void runs(){
		System.out.println(name+"好吃懒做\n今年岁数："+age);
	}
}
