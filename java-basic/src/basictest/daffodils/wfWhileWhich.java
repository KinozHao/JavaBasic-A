package basictest.daffodils;

public class wfWhileWhich {
// whileѭ�������ˮ�ɻ����ļ���
	public static void main(String[] args) {
		int a=100;
		while(a<=999){
			int ge=a%10;
			int shi=a/10%10;
			int bai=a/100;
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai==a){
				System.out.println(a);
			}
			a++;
		}

	}

}
