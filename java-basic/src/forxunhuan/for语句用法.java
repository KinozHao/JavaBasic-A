package forxunhuan;

import java.util.Scanner;
/*
 * 4.01ѭ���ṹ�����for�����÷�:
       ѭ���ṹfor���ĸ�ʽ��
   for����ʼ�����ʽ���������ʽ��ѭ����Ĳ������ʽ��
 * */
public class for����÷� {
	public static void main(String[] args) {
/*		for(int a=10;a<=15;a++){
			System.out.println("Hello world");
		}*/
		//typeOMethod();

		//����100���ڵ�ż��,����ż���ĺͣ�һ���ж��ٸ�ż��
		int sum = 0;	//��¼ż���ĺ�
		int count = 0;	//��¼�ж��ٸ�ż��
		for (int i = 1; i <=100 ; i++) {
			if (i % 2 == 0){
				System.out.println(i);
				sum += i;
				count++;
			}
		}
		System.out.println("�ܺ�Ϊ:"+sum);
		System.out.println("һ����ż����ô��:"+count);
	}
	private static void typeOMethod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���");
		String identity = sc.next();
		System.out.println("���ѽ�");
		int money = sc.nextInt();


		if (identity.equals("�˿�")){
			if (money>=100) {
				System.out.println("����");
			}else {
				System.out.println("������");
			}
		}else if (identity.equals("��Ա") ){

				System.out.println("��Ա�ۿ�");
		}else{
			System.out.println("��������");
		}
		System.out.println("��������:"+identity+"���������ѽ����:"+money);
		if (money>=100) {
			System.out.println("���ۺ�����:" + money * 0.9);
		}else if (identity.equals("��Ա")){
			System.out.println("��Ա��9��:"+money*0.9);
		}else{
			System.out.println("һ����:"+money+"Ǯ");
		}
	}

}
