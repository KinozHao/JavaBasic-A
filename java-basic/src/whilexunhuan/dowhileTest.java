package whilexunhuan;

public class dowhileTest {
	public static void main(String[] args) {
		//waterFlower();
		//waterFlowerTow();
		sumCount();


	}

	private static void sumCount() {	//1-100��ż����ż���ĺ͡�ż���ж��ٸ�
		int i =1;
		int sum =0;	//��
		int counts =0;	//����
		do {
			if (i % 2 == 0) {
				System.out.println(i);
				sum += i;
				counts ++;
			}
			i++;
		}while (i<=100);
		System.out.println("��"+sum);
		System.out.println("����"+counts);
	}

	private static void waterFlowerTow() {	//ˮ�ɻ����ļ���
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

	private static void waterFlower() {		//ˮ�ɻ��м���
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
