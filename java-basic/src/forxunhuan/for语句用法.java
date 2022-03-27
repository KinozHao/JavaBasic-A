package forxunhuan;

import java.util.Scanner;
/*
 * 4.01循环结构概念和for语句的用法:
       循环结构for语句的格式：
   for（初始化表达式；条件表达式，循环后的操作表达式）
 * */
public class for语句用法 {
	public static void main(String[] args) {
/*		for(int a=10;a<=15;a++){
			System.out.println("Hello world");
		}*/
		//typeOMethod();

		//遍历100以内的偶数,所有偶尔的和，一共有多少个偶数
		int sum = 0;	//记录偶数的和
		int count = 0;	//记录有多少个偶数
		for (int i = 1; i <=100 ; i++) {
			if (i % 2 == 0){
				System.out.println(i);
				sum += i;
				count++;
			}
		}
		System.out.println("总和为:"+sum);
		System.out.println("一共有偶数这么多:"+count);
	}
	private static void typeOMethod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("身份");
		String identity = sc.next();
		System.out.println("消费金额：");
		int money = sc.nextInt();


		if (identity.equals("顾客")){
			if (money>=100) {
				System.out.println("打折");
			}else {
				System.out.println("不打折");
			}
		}else if (identity.equals("会员") ){

				System.out.println("会员折扣");
		}else{
			System.out.println("输入有误");
		}
		System.out.println("你的身份是:"+identity+"，您的消费金额是:"+money);
		if (money>=100) {
			System.out.println("打折后金额是:" + money * 0.9);
		}else if (identity.equals("会员")){
			System.out.println("会员价9折:"+money*0.9);
		}else{
			System.out.println("一共是:"+money+"钱");
		}
	}

}
