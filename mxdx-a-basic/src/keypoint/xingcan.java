package keypoint;

/*
* 什么是形参
* 写在方法()里的 写在方法{}里的
* 同时形参也是局部变量
* */
public class xingcan {
	//方法的形式参数是类名时如何调用
	public static void main(String[] args) { 
		people s=new people();
		print(s);
		//print(10);
	}
	/*public static void print(int x){
		System.out.println(x);
	}*/
	public static void print(people stu){
		stu.name="Carzy";
		stu.age=19;
		stu.speak();
		
	}

}
class people{
	String name;
	int age;
	public void speak(){
		System.out.println(name+"..."+age);
		String city = "tokyo";	//局部变量无初始化值 需赋值
		System.out.println("city: "+city);
	}
}
