package duotai;

public class ����905��̬SuperMan{
	public static void main(String[] args) {
	Person s=new superman();	//���������������
	s.business();	//���뿴���(����)	���п��ұ�(����) ��̬��
	System.out.println(s.name);
//	s.fly();//����Ϊ����,��������ڿ����Ǹ��� ������û��fly ����˵���޷����е�
	//((superman) s).fly();
	}
}
class Person{				//����
	String name="Tesko";	//��Ա����
	public void business(){	//��Ա����
		System.out.println("Talk business ");
	}
}
class superman extends Person{
	public void business(){
		System.out.println("Talk army business for millions$");
	}
	public void fly(){
		System.out.println("Pants out and fly to help people");
	}
}