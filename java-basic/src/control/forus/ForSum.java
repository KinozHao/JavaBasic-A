package control.forus;

public class ForSum {
	public static void main(String[] args) {
	//练习一求出1-10相加的和
		/*int num=0;
		for( int a=1 ; a <= 10; a++){
			num=num+a;
		}
		System.out.println("num="+num);*/
	//练习二求出1-100之间的偶数
		/*int sum=0;
		for(int a=1;a<=100;a++){
		if(a % 2 ==0){
			sum=sum+a;
		}
	}
		System.out.println("sum="+sum);*/
	//练习三求出1-100之间的奇数
		int sum=0;
		for(int a=1;a<=100;a++){
			if(a % 2 !=0){
				sum=sum+a;
			}
		}
		System.out.println("sum="+sum);

}
}
