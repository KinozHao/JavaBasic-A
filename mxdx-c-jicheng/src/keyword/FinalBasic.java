package keyword;
//final与类 属性 方法 的关系
public class FinalBasic {
	public static void main(String[] args) {
		cx819s s=new cx819s();
		s.runs();
	}
}
/*final*/ class cx819{ //修饰类 不能继承
	public /*final*/ void runs(){ //修饰方法 不能重写
		System.out.println("hello world");
	}
}
class cx819s /*extends keyword.cx819*/{
	//常量命名规范,如果是一个单词,所有字母大写
	//如果多个单词,每个单词都大写,中间用下划线隔开
	
	//一般吧被final修饰之后的变量为常量 常和public static 搭配使用
	//public 公共的谁都可以访问  static 静态的可以类名.访问 
	public static final double PI=3.14;
	final int MAX_NUM=10;//修饰变量就变成了常量 只能被赋值一次
	public void runs(){
		//MAX_NUM=1000;	//可以直接访问不能改变	
		System.out.println(MAX_NUM);
		System.out.println("Noway hello world");
	}
}