package duotai;

public class dtbasic {
	public static void main(String[] args) {
	cat x=new cat();
	x.eat();
	dongwu y=new cat();//��������ָ���������
	y.eat();
	}
}
/**
 * Polymorpic��ǰ��	Ҫ��inheritance Ҫ��method override 
 * Ҫ�и�������ָ���������
 * �������� �����������=new ��������();
 */
class dongwu{
	public void eat(){
		System.out.println("Animals eats food");
	}
}
class cat extends dongwu{
	public void eat(){
		System.out.println("Cat eats fishs");
	}
}
