package fangfapackage;
import java.util.Scanner;
public class 方法的练习2判断两个数是否相等 {
	public static void main(String[] args) {
		//判断两个数是否相等
		//没有使用import键盘录入
		/*boolean a=b(10,20);
		System.out.println(a);
	}
	public static boolean b(int ak,int m4){
		boolean a=(ak==m4);
		return a;
	}*/
		//-------------------------------------------
		//使用了import键盘录入
		Scanner sc=new Scanner(System.in);
		System.out.println("enter teh first number");
		int a=sc.nextInt();//键盘刻入数字存储在a
		System.out.println("enter the 2 number");
		int b=sc.nextInt();//键盘刻入数字存储在b
		boolean max=getmax(a,b); //刻入a和b的值赋值给max
		System.out.println(max);
	}
	public static boolean getmax(int tt,int kk){
		boolean max=(tt==kk)?true:false;
		return max;
	}
}
