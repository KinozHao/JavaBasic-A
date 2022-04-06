package control.ifus;

public class ifQuestion {

	public static void main(String[] args) {

		exchangeMethod();    //两个数值的交换

		judgeOutputMethod();    //根据要求打印对应结果

		biggestMethod();    //求最大值
	}

	private static void exchangeMethod() {
		int B_B = 1;
		int C_C = 2;
		int temp = B_B;
		B_B = C_C;
		C_C = temp;
		System.out.println("B_B= "+B_B);
		System.out.println("C_C= "+ C_C);
	}

	private static void judgeOutputMethod() {
		/*
		* 声明2个double变量赋值
		* 判断第一个数大于10.0 / 第二个数小于30.0
		* 打印两者之和/打印两者乘集
		* */
		double d1 = 12.3;
		double d2 = 22.4;
		double sum = d1+d2;
		double multiplication = d1*d2;
		if (d1 > 10.0 && d2 < 30.0){
			System.out.println("sum result: "+sum);
		}else {
			System.out.println("multiplication result: "+multiplication);
		}
	}

	private static void biggestMethod() {
		//求三数最大值
		//format0
		int a=10;
		int b=20;
		int c=30;
		int max;

		if (a>b && b>c){
			max=a;
		}else if (c>a && c>b){
			max=c;
		}else
			max=b;
		System.out.println(max);
		System.out.println("--------------------------");

		//format1
		int t = 10;
		int i = 90;
		int o = 34;
		int imax;
		if (t > i){
			imax =t;
		}else{
			imax = i;
		}
		if (imax < o){
			imax = o;
		}
		System.out.println(imax);
		System.out.println("-------------------------");
		//format2
		int mks = (t > i) ? t : i;
		int mkst = (mks > o) ? mks : o;
		System.out.println(mkst);
	}

}
