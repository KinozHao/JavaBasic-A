package fangfapackage;
import java.util.Scanner;
public class 方法的练习比较两数大小 {
//方法键盘录入比较两个数的大小
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the 2 number");
		int b=sc.nextInt();
		int coco=gotmax(a,b);
		System.out.println(coco);
	}
	public static int gotmax(int ak,int m4){
		return ak>m4?ak:m4;
	}

}
/*
 * 返回两个整数的较大值
 * 1 明确返回值类型
 * 2 明确参数列表 int a,int b
 * */
