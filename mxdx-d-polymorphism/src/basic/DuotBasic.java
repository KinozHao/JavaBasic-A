package basic;

/**
 * @apiNote
 * ��̬��ǰ��	Ҫ�м̳кͷ�����д�Լ���������ָ���������
 * �������� �����������=new ��������();
 */

public class DuotBasic {
	public static void main(String[] args) {
		Cat min = new Cat();
		min.eat();

		//���������뿴�����п���
		Ainmals als = new Cat();//��������ָ���������
		als.eat();

		//���ԣ����������ж������
		System.out.println(als.leg);

		if (als instanceof Cat){	//����ת��
			Cat ct = (Cat)als;
			System.out.println("èֻ��"+ct.leg+"����");
		}
	}
}

class Ainmals {
	int leg = 88;
	public void eat(){
		System.out.println("Animals eats food");
	}
}
class Cat extends Ainmals {
	int leg = 4;
	public void eat(){
		System.out.println("Cat eats fish");
	}
}
