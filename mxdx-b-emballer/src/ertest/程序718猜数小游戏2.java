package ertest;

import java.util.*;
public class 程序718猜数小游戏2 {
	public static void main(String[] args) {
		Random s=new Random();
		int Randomnum=s.nextInt(100)+1;
		Scanner sc=new Scanner(System.in);
		for(;;){
			System.out.println("please enter number");
			int guessNum=sc.nextInt();
			if(guessNum>Randomnum){
				System.out.println("to big");
			}else if(guessNum<Randomnum){
				System.out.println("to small");
			}else{
				System.out.println("right");
				break;
			}
		}
	}

}
