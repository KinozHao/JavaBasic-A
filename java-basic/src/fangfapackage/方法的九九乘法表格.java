package fangfapackage;
import java.util.Scanner;
public class �����ľžų˷���� {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);//��������¼�����
		System.out.println("enter a number");	//��ʾ���
		int num=sc.nextInt(); //��num��ֵ�洢����
		print99(num); //���������ok ӦΪ����������void
	}
	public static void print99(int a){
		for(int ii=1;ii<=a;ii++){//����
			for(int jj=1;jj<=ii;jj++){//����
				System.out.print(ii+"*"+jj+"="+(ii*jj)+"\t");
			}
			System.out.println();
		}
	}

}
