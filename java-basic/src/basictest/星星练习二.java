package basictest;

public class ������ϰ�� {

	public static void main(String[] args) {
		//������
		for(int i=1;i<=5;i++){//��ѭ��
			for(int f=1;f<=i;f++){//��ѭ��
			System.out.print("*");
			}
			System.out.println();//�ѹ�껻����һ������
		}
		//������
		for(int i=1;i<=5;i++){//��ѭ��
			for(int f=1;f<=5-i;f++){//��ѭ��
				System.out.print("*");
			}
			System.out.println();//�ѹ�껻����һ������
		}

		System.out.println();

		for (int i = 0; i <5 ; i++) {
			//���"-"
			for (int j = 0; j <4-i ; j++) {
				System.out.print(" ");
			}
			//���"* "
			for (int k = 0; k <i+1 ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
