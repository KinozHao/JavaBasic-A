public class ConstructorBasic {

	public static void main(String[] args) {
		Person c=new Person();//在一创建对象的时候,系统就帮我调用了构造方法
		//c.Person();		  //构造方法不能用对象调用
		c.runs();
	}

}
class Person{
	private String name;
	private int age;
	//构造方法
	public Person(){
		name="成周洲";
		age=16;
		return;//构造方法也是有return语句的，格式是return;
	}
	public void runs(){
		System.out.println(name+"好吃懒做\t岁数："+age);
	}
}
