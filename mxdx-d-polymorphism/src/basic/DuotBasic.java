package basic;

/**
 * @apiNote
 * ��̬��ǰ��	Ҫ�м̳кͷ�����д�Լ���������ָ���������
 * �������� �����������=new ��������();
 */

public class DuotBasic {
	public static void main(String[] args) {
	cat min = new cat();
	min.eat();

	ainmals als = new cat();//��������ָ���������
	als.eat();
	}
}

class ainmals {
	public void eat(){
		System.out.println("Animals eats food");
	}
}
class cat extends ainmals {
	public void eat(){
		System.out.println("Cat eats fishs");
	}
}
