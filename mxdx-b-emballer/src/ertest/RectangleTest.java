package ertest;

import java.util.Scanner;
public class RectangleTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("�����");
		int width=sc.nextInt();
		System.out.println("�����");
		int high=sc.nextInt();
		Rectangle s=new Rectangle(width,high);
		System.out.println("�������ܳ�:"+s.getLength());
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
	//�ܳ�����
	public float getLength(){//���ܳ�
		return 2*(width+high);
	}
	//�������
	public float getArea(){//�����
		return width*high;
	}
}
