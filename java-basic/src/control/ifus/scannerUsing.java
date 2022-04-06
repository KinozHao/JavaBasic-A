package control.ifus;

import java.util.Scanner;
/**
 * Scanner的三道练习题
 * 1:键盘录入两个数据并对这两个数据求值： （把两个变量的数据赋予给一个新的常量即可）
 * 2:键盘录入两个数据并获取这两个数中的最大值：（可运用三元运算符来进行比较数值的大小）
 * 3:键盘录入两个数据并获取这两个值是否相等： （可运用boolean类型进行对比）
 * 4:键盘录入三个数据并获取这三个数据中的最大值: (方法和2基本相同,三元运算符来比较)
 * */
public class scannerUsing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of a");
		int a=sc.nextInt();
		System.out.println("enter the number of b");
		int b=sc.nextInt();
		System.out.println("enter the number of c");
		int c=sc.nextInt();

		//sumMethod(a, b);
		//twoNumberMethod(a, b);
		//threeNumberMethod(a, b, c);
		isEqualMethod(a, b);


	}

	private static void isEqualMethod(int a, int b) {
		//判断两个数是否相等
		//三元运算符实现
		boolean isEqual = (a == b) ? true:false;
		System.out.println(isEqual);
	}

	private static void threeNumberMethod(int a, int b, int c) {
		//三个数最大数

		//方法1、三元运算符
		int max=(a>b)? a:b;
		max=(max>c)? max:c;
		System.out.println("三元运算符解答："+max);

		//方法2、选择结构if
		int o;
		if (a>b && b>c){
			o = a;
		}else if (c>a && c>b){
			o = c;
		}else{
			o = b;
		}
		System.out.println("if语句解答："+o);
	}

	private static void twoNumberMethod(int a, int b) {
		//两个数最大值
		if (a>b){
			System.out.println("if语句解答："+a);
		}else {
			System.out.println("if语句解答："+b);
		}
		int mex = (a>b) ? a:b;
		System.out.println("三元运算符解答："+mex);
	}

	private static void sumMethod(int a, int b) {
		//两个数的和
		int sum = a+b;
		System.out.println("sum number is "+sum);
	}

}
