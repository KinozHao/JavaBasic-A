package shunxianFlower;
//while�������м���ˮ�ɻ�����
public class wfWhileHow {
	public static void main(String[] args) {
		int count=0;
		int a=100;
		while(a<=999){
			int ge=a%10;
			int shi=a/10%10;
			int bai=a/100;
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai==a){
			count++;
			}
			a++;
		}
		System.out.println(count);
	}

}
