package basictest;

public class 星星练习二 {

	public static void main(String[] args) {
		//正三角
		for(int i=1;i<=5;i++){//外循环
			for(int f=1;f<=i;f++){//内循环
			System.out.print("*");
			}
			System.out.println();//把光标换到下一行行首
		}
		//倒三角
		for(int i=1;i<=5;i++){//外循环
			for(int f=1;f<=5-i;f++){//内循环
				System.out.print("*");
			}
			System.out.println();//把光标换到下一行行首
		}

		System.out.println();

		for (int i = 0; i <5 ; i++) {
			//输出"-"
			for (int j = 0; j <4-i ; j++) {
				System.out.print(" ");
			}
			//输出"* "
			for (int k = 0; k <i+1 ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
