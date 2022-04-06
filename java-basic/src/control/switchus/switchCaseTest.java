package control.switchus;

import java.util.Scanner;

public class switchCaseTest {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		String PROVINCE="Macao";
		String CITY="HongKong";
		switch(CITY){
		case "Macao" :
			System.out.println(PROVINCE+"is my Hometown "+CITY+" is my work place");
			break;

		case "HongKong" :
			System.out.println(PROVINCE+"is my Hometown "+CITY+" i lovely hk too");
			break;

		default:
			System.out.println(PROVINCE+"is my Hometown "+CITY+" the best finacial city");
		}
	//reasonMonthMethod(scanner);//练习几月份是什么季节


}

	private static void reasonMonthMethod(Scanner scanner) {
		System.out.println("输入几月份");
		int month = scanner.nextInt();
		switch (month){
			case 1:
			case 2:
			case 3:
				System.out.println("春");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("夏");
				break;
			case 7:
			case 8:
			case 9:
				System.out.println("秋");
				break;
			case 10:
			case 11:
			case 12:
				System.out.println("冬");
				break;
			default:
				System.out.println("other");
		}
	}
}