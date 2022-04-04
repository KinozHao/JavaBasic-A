package keyword;
/**
 * @apiNote final的用法
 * 1常量命名规范,一个单词/多个单词,字母全部大写,多个单词中间加_
 * 2前缀final的变量都为常量,与public static搭配
 * 3static 静态的可以类名.访问
 * 4修饰类 类不能继承
 * 5修饰方法 方法不能重写
 * 6修饰变量 变量就成为常量**/

public class FinalView {
	public static void main(String[] args) {
		FinalB s=new FinalB();
		s.runs();
	}
}
final class FinalA{
	public final void runs(){
		System.out.println("hello world");
	}
}


class FinalB extends Object{
	public static final double PI=3.14;
	final int MAX_NUM=10;//常量只能赋值一次
	public void runs(){
		//MAX_NUM=1000;	//可以直接访问不能改变
		System.out.println("这是一个常量数: "+MAX_NUM);
	}
}