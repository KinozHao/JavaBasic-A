package sitest;
/**
 * @apiNote ���ڳ��˵�С��ϰ
 * */


public class SupermanView {
	public static void main(String[] args) {
		Person s=new superman();	//���������������
		s.business();
		//�׶� ����ʹ�������Լ�������/����
		//s.fly();
		((superman) s).fly();	//����ת��
	}
}
class Person{
	String name="Teaks";
	public void business(){
		System.out.println("Talk business ");
	}
}
class superman extends Person{
	public void business(){
		System.out.println(name+" Talk army business for millions$");
	}
	public void fly(){
		System.out.println("Pants out and fly to help people");
	}
}