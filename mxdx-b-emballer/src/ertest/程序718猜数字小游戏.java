package ertest;

import java.util.Scanner;
public class ����718������С��Ϸ {
	public static void main(String[] args) {
		//������С��Ϸ������1-100֮��
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a int number between 1-100");
	int Ges=(int)(Math.random()*100)+1;//���Ժ�������������;
	while(true){//����whileѭ��
		int result=sc.nextInt();//����¼��
		if(result>Ges){
			System.out.println("to big");//̫����
		}else if(result<Ges){
			System.out.println("to small");//̫С��
		}else{
			System.out.println("Oh congruatulations this is your luck number");//������
		break;//���к���ת
		}
	}
	}

}
