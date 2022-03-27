package keyword;
/**
* @apiNote static关键词使用的注意事项
* */
public class StaticAttention {
	public static void main(String[] args) {
		oh n=new oh();
		n.runs();
		oh.run();
	}

}
class oh{
	int num1=1;//非静态的成员变量
	static int num2=2;//静态的成员变量
	public void runs(){//非静态的成员方法
		System.out.println(num1);//非静态的成员方法 既可以访问静态的成员 也可以访问非静态的成员
		System.out.println(num2);
	}
	public static void run(){//静态的成员方法
		//System.out.println(num1);
		System.out.println(num2);
	}
}
