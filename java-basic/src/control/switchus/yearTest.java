package control.switchus;

import java.util.Scanner;

public class yearTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//yearOneMethod(scanner);
		//��һ�꼸�¼�������һ��ĵڼ���(Ҫ�ж���һ���Ƿ�Ϊ����)
		System.out.println("������year:");
		int year = scanner.nextInt();
		System.out.println("������month:");
		int month = scanner.nextInt();
		System.out.println("������day:");
		int day = scanner.nextInt();

		int WHICH_DAY = 0;
		switch (month){
			case 12:
				WHICH_DAY +=30;
			case 11:
				WHICH_DAY +=31;
			case 10:
				WHICH_DAY +=30;
			case 9:
				WHICH_DAY +=31;
			case 8:
				WHICH_DAY +=31;
			case 7:
				WHICH_DAY +=30;
			case 6:
				WHICH_DAY +=31;
			case 5:
				WHICH_DAY +=30;
			case 4:
				WHICH_DAY +=31;
			case 3:
				if ((year % 4 ==0 && year/100 != 0) || year%400 == 0){
					WHICH_DAY += 29;
					System.out.println("����");
				}else{
					WHICH_DAY += 28;
					System.out.println("��������");
				}
			case 2:
				WHICH_DAY +=31;
			case 1:
				WHICH_DAY += day;

		}
		System.out.println(year+"�� "+month+"�� "+day+"���ǵ���ĵ� "+WHICH_DAY+" ��");
	}

	private static void yearOneMethod(Scanner scanner) {
		//���¼�������һ��ĵڼ���
		System.out.println("������2021���month");
		int month = scanner.nextInt();
		System.out.println("������2021���day");
		int day = scanner.nextInt();

		int WHICH_DAY = 0;
		switch (month){
			case 12:
				WHICH_DAY +=30;
			case 11:
				WHICH_DAY +=31;
			case 10:
				WHICH_DAY +=30;
			case 9:
				WHICH_DAY +=31;
			case 8:
				WHICH_DAY +=31;
			case 7:
				WHICH_DAY +=30;
			case 6:
				WHICH_DAY +=31;
			case 5:
				WHICH_DAY +=30;
			case 4:
				WHICH_DAY +=31;
			case 3:
				WHICH_DAY +=28;
			case 2:
				WHICH_DAY +=31;
			case 1:
				WHICH_DAY += day;

		}
		System.out.println("2020�� "+month+"�� "+day+"���ǵ���ĵ� "+WHICH_DAY+" ��");
	}

}
