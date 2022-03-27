package whilexunhuan;

public class dowhileTest {
	public static void main(String[] args) {
		//waterFlower();
		//waterFlowerTow();
		sumCount();


	}

	private static void sumCount() {	//1-100的偶数、偶数的和、偶数有多少个
		int i =1;
		int sum =0;	//和
		int counts =0;	//个数
		do {
			if (i % 2 == 0) {
				System.out.println(i);
				sum += i;
				counts ++;
			}
			i++;
		}while (i<=100);
		System.out.println("和"+sum);
		System.out.println("个数"+counts);
	}

	private static void waterFlowerTow() {	//水仙花是哪几个
		int b =100;
		do {
			int ge= b %10;
			int shi= b /10%10;
			int bai= b /100;
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai== b){
				System.out.println(b);
			}
			b++;
		}while (b <1000);
	}

	private static void waterFlower() {		//水仙花有几个
		int count=0;
		int a=100;
		do{
			int ge=a%10;
			int shi=a/10%10;
			int bai=a/100;
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai==a){
				count++;
			}
			a++;
		}
		while(a<1000);
		System.out.println("count="+count);
	}

}
