package control.switchus;

import java.util.Scanner;

public class yearTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//yearOneMethod(scanner);
		//哪一年几月几号是这一年的第几天(要判断这一年是否为闰年)
		System.out.println("请输入year:");
		int year = scanner.nextInt();
		System.out.println("请输入month:");
		int month = scanner.nextInt();
		System.out.println("请输入day:");
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
					System.out.println("闰年");
				}else{
					WHICH_DAY += 28;
					System.out.println("不是闰年");
				}
			case 2:
				WHICH_DAY +=31;
			case 1:
				WHICH_DAY += day;

		}
		System.out.println(year+"年 "+month+"月 "+day+"日是当年的第 "+WHICH_DAY+" 天");
	}

	private static void yearOneMethod(Scanner scanner) {
		//几月几号是这一年的第几天
		System.out.println("请输入2021年的month");
		int month = scanner.nextInt();
		System.out.println("请输入2021年的day");
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
		System.out.println("2020年 "+month+"月 "+day+"日是当年的第 "+WHICH_DAY+" 天");
	}

}
