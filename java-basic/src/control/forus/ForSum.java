package control.forus;

public class ForSum {
	public static void main(String[] args) {
	//��ϰһ���1-10��ӵĺ�
		/*int num=0;
		for( int a=1 ; a <= 10; a++){
			num=num+a;
		}
		System.out.println("num="+num);*/
	//��ϰ�����1-100֮���ż��
		/*int sum=0;
		for(int a=1;a<=100;a++){
		if(a % 2 ==0){
			sum=sum+a;
		}
	}
		System.out.println("sum="+sum);*/
	//��ϰ�����1-100֮�������
		int sum=0;
		for(int a=1;a<=100;a++){
			if(a % 2 !=0){
				sum=sum+a;
			}
		}
		System.out.println("sum="+sum);

}
}
