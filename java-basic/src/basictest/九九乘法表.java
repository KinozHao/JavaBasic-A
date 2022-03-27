package basictest;

public class 九九乘法表 {
	public static void main(String [] args){
		for(int a=1;a<=9;a++){
			for(int b=1;b<=a;b++){
//				it means b*a=(a*b)+"\t" and you just thinking write
//				code mode is ok
				System.out.print(b+"*"+a+"="+(a*b)+"\t");//转义字符可以用双引号括起来，也可以用单引号扩起来
			}
				System.out.println();
		}
	}
 
}
