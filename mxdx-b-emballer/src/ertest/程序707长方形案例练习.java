package ertest;

import java.util.Scanner;
public class ����707�����ΰ�����ϰ {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the first number for the width");
		int width=sc.nextInt();
		System.out.println("enter the second number for the high");
		int high=sc.nextInt();
		Rectangle s=new Rectangle(width,high);
		System.out.println("�������ܳ�:"+s.getLenght());
		System.out.println("���������:"+s.getArea());
	}

}
class Rectangle{
	private float width;//�����
	private float high;//�����
	public Rectangle(){}//�޲ι���
	public Rectangle(float width,float high){//�вι���
		this.width=width;//������ֵ
		this.high=high;//������ֵ
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
	public float getLenght(){//���ܳ�
		return 2*(width+high);
	}
	public float getArea(){//�����
		return width*high;
	}
}
