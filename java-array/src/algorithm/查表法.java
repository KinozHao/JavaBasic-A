package algorithm;

import java.util.Scanner;
public class 查表法 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number 1-7");
		int week=sc.nextInt();
		System.out.println("西南国企:" + getweek(week));
		
	}
	/**
	 * 根据对应的索引返回对应的星期
	 * 返回值类型char
	 * 参数列表inte week
	 */
	public static char getweek(int week){
		char[] a={' ','一','二','三','四','五','六','七'};
		return a[week];
	}

}
