package fangfapackage;
import java.util.Scanner;
public class ��������ϰ2�ж��������Ƿ���� {
	public static void main(String[] args) {
		//�ж��������Ƿ����
		//û��ʹ��import����¼��
		/*boolean a=b(10,20);
		System.out.println(a);
	}
	public static boolean b(int ak,int m4){
		boolean a=(ak==m4);
		return a;
	}*/
		//-------------------------------------------
		//ʹ����import����¼��
		Scanner sc=new Scanner(System.in);
		System.out.println("enter teh first number");
		int a=sc.nextInt();//���̿������ִ洢��a
		System.out.println("enter the 2 number");
		int b=sc.nextInt();//���̿������ִ洢��b
		boolean max=getmax(a,b); //����a��b��ֵ��ֵ��max
		System.out.println(max);
	}
	public static boolean getmax(int tt,int kk){
		boolean max=(tt==kk)?true:false;
		return max;
	}
}
