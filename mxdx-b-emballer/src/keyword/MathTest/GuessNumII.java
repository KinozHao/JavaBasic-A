package keyword.MathTest;
//Random类实现随机数小游戏
import java.util.Random;
import java.util.Scanner;
public class GuessNumII {
	public static void main(String[] args) {
		//1调用随即类
		Random s = new Random();

		int sjs = s.nextInt(100)+1;
		//2键盘录入一个数字
		Scanner sc = new Scanner(System.in);


		for(;;){
			System.out.println("please enter number");
			//3持续录入随机数字
			int guessNum = sc.nextInt();

			//4判断录入的数字 至到正确为止
			if(guessNum > sjs){
				System.out.println("to big");
			}else if(guessNum< sjs){
				System.out.println("to small");
			}else{
				System.out.println("input currently!");
				//5输入正确跳出
				break;
			}
		}
	}

}
