package ertest;

import java.util.Scanner;
public class RectangleTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("输入宽");
		int width=sc.nextInt();
		System.out.println("输入高");
		int high=sc.nextInt();
		Rectangle s=new Rectangle(width,high);
		System.out.println("长方形周长:"+s.getLength());
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
	//周长方法
	public float getLength(){//求周长
		return 2*(width+high);
	}
	//面积方法
	public float getArea(){//求面积
		return width*high;
	}
}
