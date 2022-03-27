package ertest;

import java.util.Scanner;
public class 程序707长方形案例练习 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the first number for the width");
		int width=sc.nextInt();
		System.out.println("enter the second number for the high");
		int high=sc.nextInt();
		Rectangle s=new Rectangle(width,high);
		System.out.println("长方形周长:"+s.getLenght());
		System.out.println("长方形面积:"+s.getArea());
	}

}
class Rectangle{
	private float width;//定义宽
	private float high;//定义高
	public Rectangle(){}//无参构造
	public Rectangle(float width,float high){//有参构造
		this.width=width;//变量赋值
		this.high=high;//变量赋值
	}
	public void setwidth(float width){
		this.width=width;
	}
	public float getwidth(){
		return width;
	}
	public void sethigh(float high){
		this.high=high;
	}
	public float gethigh(){
		return high;
	}
	public float getLenght(){//求周长
		return 2*(width+high);
	}
	public float getArea(){//求面积
		return width*high;
	}
}
