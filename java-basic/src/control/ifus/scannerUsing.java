package control.ifus;

import java.util.Scanner;
/**
 * Scanner��������ϰ��
 * 1:����¼���������ݲ���������������ֵ�� �����������������ݸ����һ���µĳ������ɣ�
 * 2:����¼���������ݲ���ȡ���������е����ֵ������������Ԫ����������бȽ���ֵ�Ĵ�С��
 * 3:����¼���������ݲ���ȡ������ֵ�Ƿ���ȣ� ��������boolean���ͽ��жԱȣ�
 * 4:����¼���������ݲ���ȡ�����������е����ֵ: (������2������ͬ,��Ԫ��������Ƚ�)
 * */
public class scannerUsing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of a");
		int a=sc.nextInt();
		System.out.println("enter the number of b");
		int b=sc.nextInt();
		System.out.println("enter the number of c");
		int c=sc.nextInt();

		//sumMethod(a, b);
		//twoNumberMethod(a, b);
		//threeNumberMethod(a, b, c);
		isEqualMethod(a, b);


	}

	private static void isEqualMethod(int a, int b) {
		//�ж��������Ƿ����
		//��Ԫ�����ʵ��
		boolean isEqual = (a == b) ? true:false;
		System.out.println(isEqual);
	}

	private static void threeNumberMethod(int a, int b, int c) {
		//�����������

		//����1����Ԫ�����
		int max=(a>b)? a:b;
		max=(max>c)? max:c;
		System.out.println("��Ԫ��������"+max);

		//����2��ѡ��ṹif
		int o;
		if (a>b && b>c){
			o = a;
		}else if (c>a && c>b){
			o = c;
		}else{
			o = b;
		}
		System.out.println("if�����"+o);
	}

	private static void twoNumberMethod(int a, int b) {
		//���������ֵ
		if (a>b){
			System.out.println("if�����"+a);
		}else {
			System.out.println("if�����"+b);
		}
		int mex = (a>b) ? a:b;
		System.out.println("��Ԫ��������"+mex);
	}

	private static void sumMethod(int a, int b) {
		//�������ĺ�
		int sum = a+b;
		System.out.println("sum number is "+sum);
	}

}
