package basictest;

public class 重载的基本概念使用 {
//overload 重载求出最终三个值
	public static void main(String[] args) {
		int num=add(1,2);
		System.out.println(num);
		int num2=add(1,2,3);
		System.out.println(num2);
		double num3=add(17.6,13.2,0.20);
		System.out.println(num3);
	}
	public static int add(int a,int b){
		return a+b;
	}
	public static int add(int a,int b,int c){
		return a+b+c;
	}
	public static double add(double aa,double bb,double cc){
		return aa+bb+cc;
	}

}
