package fangfapackage;
import java.util.Scanner;
public class 方法的九九乘法表格 {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);//创建键盘录入对象
		System.out.println("enter a number");	//提示语句
		int num=sc.nextInt(); //把num的值存储起来
		print99(num); //单独输出就ok 应为返回类型是void
	}
	public static void print99(int a){
		for(int ii=1;ii<=a;ii++){//行数
			for(int jj=1;jj<=ii;jj++){//列数
				System.out.print(ii+"*"+jj+"="+(ii*jj)+"\t");
			}
			System.out.println();
		}
	}

}
