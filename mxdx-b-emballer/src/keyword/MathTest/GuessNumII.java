package keyword.MathTest;
//Random��ʵ�������С��Ϸ
import java.util.Random;
import java.util.Scanner;
public class GuessNumII {
	public static void main(String[] args) {
		//1�����漴��
		Random s = new Random();

		int sjs = s.nextInt(100)+1;
		//2����¼��һ������
		Scanner sc = new Scanner(System.in);


		for(;;){
			System.out.println("please enter number");
			//3����¼���������
			int guessNum = sc.nextInt();

			//4�ж�¼������� ������ȷΪֹ
			if(guessNum > sjs){
				System.out.println("to big");
			}else if(guessNum< sjs){
				System.out.println("to small");
			}else{
				System.out.println("input currently!");
				//5������ȷ����
				break;
			}
		}
	}

}
