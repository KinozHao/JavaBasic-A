package binterface;

public class 程序917接口的成员特点 {

	public static void main(String[] args) {
		goons a=new goons();	//新建对象
		a.print();
		a.wang();
		System.out.println(inters.NUM);//如果可以类名.调用 就是静态的
	}
}
interface inters{
	public static final int NUM=10;		//接口中定义的变量都是常量 前面默认加上了final 值无法在类实现接口中修改值
	//同时接口还是暴漏公开的 所以前面还会默认加上了static 
	//因为可以类名.调用 前面还会默认加上了public
	/*public inters(){}*/				//接口中没有构造方法
	//public void eat(){}				//接口中只能定义abstract方法
	void wang();				//抽象方法在接口中可以这么写 系统会默认添加 public 和abstract建议自己手动添加
}
class goons extends Object implements inters{	//一个类不写继承类的话 默认继承的是Object类
	public void print(){	//成员方法
		System.out.println(NUM);
	}
	public void wang(){
		System.out.println("Hello world");
	}
	public goons(){}//如果类实现中出现构造方法有super对接的是Object类 最顶级父类
}
