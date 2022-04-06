package basic;
//多态中成员访问特点
public class AboutParam {
	public static void main(String[] args) {
//		one x=new two();//父类引用指向子类对象
//		System.out.println(x.num);
//		two y=new two();
//		System.out.println(y.num);
		one f=new two();
//		f.runs();
		f.funs(); //这里相当于one.funs();
	}
}
//成员变量	编译看左边(父类)	运行看左边(父类)
//成员方法	编译看左边(父类)	运行看右边(子类) 动态绑定
//编译看左边(父类),运行看左边(父类)
//静态和类相关,算不上重写,所以,访问还是左边的
//只有非静态的成员方法,编译看左边,运行看右边
class one{
	int num=10;
	public void runs(){//成员方法
		System.out.println(num);
	}
	public static void funs(){	//静态成员方法
		System.out.println("static");
	}
}
class two extends one{
	int num=20;
	public void runs(){			//成员方法
		System.out.println(num);
	}
}