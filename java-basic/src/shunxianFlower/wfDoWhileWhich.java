package shunxianFlower;

public class wfDoWhileWhich {
	// do whileѭ�������ˮ�ɻ����ļ���
	public static void main(String[] args) {
		int a=100;
		do{
			int ge=a%10;
			int shi=a/10%10;
			int bai=a/100;
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai==a){
				System.out.println("so a="+a);
			}
			a++;
		}
		while(a<1000);
		

	}

}
