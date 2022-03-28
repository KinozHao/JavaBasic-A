package keyword.math;
/**
 * @apiNote 随机数的使用
 * */
public class UsMath {
	public static void main(String[] args) {
		/*double a=Math.random();//random范围：大于等于0.0且小于1.0的伪随机double值.
		System.out.println(a);*/
		for(int a=0;a<10;a++){
			System.out.println(Math.random());//随机生成10次 随机数值在0.0-1.0;
		}
		//Math随机默认为小数值,可以用int进行强转即可,*100取值就在0-99之内;
		for(;;){
			System.out.println((int)(Math.random()*100));//用int强转后for无限循环0-99的数
		}
		//生成1-100的随机数
		//Math.random()0.0000000-0.999999999
		//Math.random()*100=========>0.00000-99.999999999
	}

}
