package algorithm;

import java.util.Scanner;
public class ��� {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number 1-7");
		int week=sc.nextInt();
		System.out.println("���Ϲ���:" + getweek(week));
		
	}
	/**
	 * ���ݶ�Ӧ���������ض�Ӧ������
	 * ����ֵ����char
	 * �����б�inte week
	 */
	public static char getweek(int week){
		char[] a={' ','һ','��','��','��','��','��','��'};
		return a[week];
	}

}
