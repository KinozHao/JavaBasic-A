package fangfapackage;

public class 方法之求和案例 {

	public static void main(String[] args) {
		int sum=add(10,20);//第一步调用add方法，将10和20传递给a和b
	}
		public static int add(int a,int b){//赋值 a=10 b=20，执行语句，把a和b相加赋值给sum
			int sum=a+b;
			System.out.println(sum);
			return sum;//通过return把sum结果返回，将方法的结果返还给sum
		}

	}
