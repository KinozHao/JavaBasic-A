//��װ�ԵĻ������
public class ExtendBasic {
	public static void main(String[] args) {
		cat c = new cat();	//cat�Լ��з������� ���ȵ����Լ��ķ�������
		c.color = "��ɫ";
		c.leg = 4;
		c.eat();
		c.sleep();
		System.out.println("è�����ɫ��"+c.color+",����"+c.leg+"����");
		System.out.println(c.toString());
		System.out.println("--------------------------");

		dog d = new dog();	//dog����animals�ķ���
		d.color = "��ɫ";
		d.leg = 4;
		System.out.println("��������ɫ��"+d.color+",����"+d.leg+"����");
	}
}
class animals{//��ͬ��һ�����Ƕ�����
	String color;	//������ɫ
	int leg;	//��������
	public void eat(){	//�Է��Ĺ���
		System.out.println("����Է�");
	}
	public void sleep(){	//˯���Ĺ���
		System.out.println("����˯��");
	}
}

class cat extends animals{
	public void eat(){	//�Է��Ĺ���
		System.out.println("è��Է�");
	}
	public void sleep(){	//˯���Ĺ���
		System.out.println("è��˯��");
	}
}

class dog extends animals{ }