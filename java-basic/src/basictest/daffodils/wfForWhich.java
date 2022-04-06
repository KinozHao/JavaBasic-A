package basictest.daffodils;
//使用for循环结构输出水仙花有哪几个
public class wfForWhich {
	//什么是水仙花：一个三位数，其各个数字的立方相加是其本身
	//例如 153=1*1*1+5*5*5+3*3*3；
	//得知条件水仙花的范围在100-999
	public static void main(String[] args) {
		System.out.println("求出1-1000中的水仙花数是什么");
		for(int a=100;a<=999;a++){ //a被赋值100并且a<=999
			int ge=a%10; //求个位
			int shi=a/10%10; //求十位
			int bai=a/10/10%10; //求百位
			if(ge*ge*ge+bai*bai*bai+shi*shi*shi==a){//如果相加与a相等
				System.out.println(a); //则打印a的值
			}
		}

	}

}
