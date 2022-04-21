/**
 * @apiNote
 * 面向对象思想代码的基本体现
 * 创建类的对象=类的实例化
 * 类和对象的使用
 * 1 创建类，设计类的成员 2 创建类的对象 3 通过对象.属性/对象.方法 调用对象的结构
 * */
public class MxdxBasic {

	public static void main(String[] args) {
		Student s=new Student();	//创建Student类的对象
			//调用类的结构 属性、方法
			s.age=17;
			s.name="jack james";
			s.gender="male";
		System.out.println(s.name+"..."+s.age+s.gender);
			s.sleep();				//调用学生类里面的方法
			s.study();
			s.talk("Spanish");
	}

}
class Student{		//学生类
	int age;		//参数(属性)
	String name;
	String gender;
	public void study(){	//行为(方法)
		System.out.println("we also study hole days");
	}
	public void sleep(){
		System.out.println("we also sleep at mindnight to late");
	}
	public void talk(String language){	//形参
		String building = "No.35";	//局部变量
		System.out.println("just talk with:"+language);
	}
}
