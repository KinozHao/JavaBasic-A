package fangfapackage;
import java.util.Scanner;
public class 方法之输出星形及其调用 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter teh first number");
		int row=sc.nextInt();
		System.out.println("enter the 2 number");
		int coalum=sc.nextInt();
		print(row,coalum);
	}
	public static void print(int aj,int ja){
		for(int i=1;i<=aj;i++){
			for(int j=1;j<=ja;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
