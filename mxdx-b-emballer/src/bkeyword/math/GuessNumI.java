package bkeyword.math;
//Math实现随机数小游戏
import java.util.Scanner;
public class GuessNumI {
	public static void main(String[] args) {
	//1调用Scanner类
	Scanner sc = new Scanner(System.in);

	System.out.println("enter a number between 1-100");

	int Ges=(int)(Math.random()*100)+1;//2生成一个随机数;

	while(true){
		int result = sc.nextInt();//3键盘录入数字

		if (result <=0 || result >100){	 //4判断数字在100之间否则抛出异常
			throw new RuntimeException("超出1-100的范围");
		}

		//5比较输入的数
		if(result>Ges){
			System.out.println("to big");
		}else if(result<Ges){
			System.out.println("to small");
		}else{
			System.out.println("currently!");
		break;//猜中后跳转
		}
	}

	}

}
