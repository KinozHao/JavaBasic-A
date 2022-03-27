package ertest;

import java.util.Scanner;
public class 程序718猜数字小游戏 {
	public static void main(String[] args) {
		//猜数字小游戏数据在1-100之间
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a int number between 1-100");
	int Ges=(int)(Math.random()*100)+1;//你脑海中想象的随机数;
	while(true){//无限while循环
		int result=sc.nextInt();//键盘录入
		if(result>Ges){
			System.out.println("to big");//太大了
		}else if(result<Ges){
			System.out.println("to small");//太小了
		}else{
			System.out.println("Oh congruatulations this is your luck number");//猜中了
		break;//猜中后跳转
		}
	}
	}

}
