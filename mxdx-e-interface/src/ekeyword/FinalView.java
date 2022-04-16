package ekeyword;
/**
 * @apiNote final的用法
 * 1常量命名规范,PARAM_LIKE_THIS
 * 2final修饰的变量都为常量,常与public static搭配
 * 4修饰类 类不能继承	修饰方法 方法不能重写	修饰变量 就成常量
 * **/

public class FinalView {
	public static void main(String[] args) {
		FinalB s = new FinalB();
		s.runs();
	}
}
final class FinalA{
	public final void runs(){
		System.out.println("hello world");
	}
}


class FinalB extends Object{
	public static final double PI = 3.14;
	final int MAX_NUM = 10;//常量只能赋值一次
	public void runs(){
		//MAX_NUM=1000;	//可以直接访问不能改变
		System.out.println("这是一个常量数: "+MAX_NUM);
	}
}