package bkeyword.math;
//Mathʵ�������С��Ϸ
import java.util.Scanner;
public class GuessNumI {
	public static void main(String[] args) {
	//1����Scanner��
	Scanner sc = new Scanner(System.in);

	System.out.println("enter a number between 1-100");

	int Ges=(int)(Math.random()*100)+1;//2����һ�������;

	while(true){
		int result = sc.nextInt();//3����¼������

		if (result <=0 || result >100){	 //4�ж�������100֮������׳��쳣
			throw new RuntimeException("����1-100�ķ�Χ");
		}

		//5�Ƚ��������
		if(result>Ges){
			System.out.println("to big");
		}else if(result<Ges){
			System.out.println("to small");
		}else{
			System.out.println("currently!");
		break;//���к���ת
		}
	}

	}

}
