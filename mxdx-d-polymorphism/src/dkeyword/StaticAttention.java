package dkeyword;
/**
* @apiNote static关键词使用的注意事项
* */
public class StaticAttention {
	public static void main(String[] args) {
		staticss n=new staticss();
		n.runs();
		staticss.run();
	}

}
class staticss {
	int num1 = 1;
	static int num2 = 2;

	public void runs(){//非静态的成员方法
		System.out.println(num1);//非静态的方法 静态属性和非静态都可调用
		System.out.println(num2);
	}
	public static void run(){//静态的方法 只能调用静态的属性
		//System.out.println(num1);
		System.out.println(num2);
	}
}
