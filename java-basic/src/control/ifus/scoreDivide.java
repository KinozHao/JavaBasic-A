package control.ifus;
//成绩划分
//Scanner的实际应用
import java.util.Scanner;
public class scoreDivide {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number beturn 1-100");
		int x=sc.nextInt();
		if(x>=90 && x<=100){
			System.out.println("成绩非常的好");
		}else if(x>=80 && x<=89){
			System.out.println("c成绩好");
		}else if(x>=70 && x<=79){
			System.out.println("成绩出色");
		}else if(x>=60 && x<=69){
			System.out.println("成绩一般");
		}else if(x>=0 && x<=59){
			System.out.println("成绩不及格");
		}else{
			System.out.println("输入错误，报错");
		}

	}

}
