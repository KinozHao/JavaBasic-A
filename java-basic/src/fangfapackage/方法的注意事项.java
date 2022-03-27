package fangfapackage;

public class 方法的注意事项 {

	public static void main(String[] args) {
		/*int a=b(30,20);
		System.out.println(a);//这样调用是可以的，但是如果需要使用这个结果不推荐这么调用
		b(40,30);//有返回值方法的单独调用，没有意义
	}
	public static int b(int aa,int bb){//方法定义时候参数用逗号隔开
		int a=aa+bb;
		System.out.println(a);
		return a;
	}
}*/
	//*****************************************************	
		
	//比较两个数的大小用return返回-------不用键盘录入
	/*	int a=c(20,30);
	}
	public static int c(int ak,int m4){
		int c=(ak>m4)?ak:m4;
		System.out.println(c);
		return c;
	}
}*/
	//比较两个数是否相同用return返回------不用键盘录入
		boolean a=c(100,100);
	}
	public static  boolean c(int ak,int m4){
		boolean c=(ak==m4);
		System.out.println(c);
		return c;
	}
}