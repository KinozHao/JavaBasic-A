package fangfapackage;
import java.util.Scanner;
public class ��������ϰ�Ƚ�������С {
//��������¼��Ƚ��������Ĵ�С
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
 * �������������Ľϴ�ֵ
 * 1 ��ȷ����ֵ����
 * 2 ��ȷ�����б� int a,int b
 * */
