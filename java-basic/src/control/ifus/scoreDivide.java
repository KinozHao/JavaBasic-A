package control.ifus;
//�ɼ�����
//Scanner��ʵ��Ӧ��
import java.util.Scanner;
public class scoreDivide {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number beturn 1-100");
		int x=sc.nextInt();
		if(x>=90 && x<=100){
			System.out.println("�ɼ��ǳ��ĺ�");
		}else if(x>=80 && x<=89){
			System.out.println("c�ɼ���");
		}else if(x>=70 && x<=79){
			System.out.println("�ɼ���ɫ");
		}else if(x>=60 && x<=69){
			System.out.println("�ɼ�һ��");
		}else if(x>=0 && x<=59){
			System.out.println("�ɼ�������");
		}else{
			System.out.println("������󣬱���");
		}

	}

}
