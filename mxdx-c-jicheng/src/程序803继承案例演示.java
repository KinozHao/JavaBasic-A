public class ����803�̳а�����ʾ {
	public static void main(String[] args) {
		catt c=new catt();
		c.color="black";
		c.leg=4;
		c.eat();
		c.sleep();
		System.out.println(c.color+"..."+c.leg);
	}
}
class animals{//��ͬ��һ�����Ƕ�����
	String color;	//�������ɫ
	int leg;	//�����ȵĸ���
	public void eat(){	//�Է��Ĺ���
		System.out.println("�Է�");
	}
	public void sleep(){	//˯���Ĺ���
		System.out.println("˯��");
	}
}
class catt extends animals{
	String color;	//�������ɫ
	int leg;	//�����ȵĸ���
	public void eat(){	//�Է��Ĺ���
		System.out.println("�Է�");
	}
	public void sleep(){	//˯���Ĺ���
		System.out.println("˯��");
	}
}
class dogg extends animals{
	/*String color;	//�������ɫ
	int ieg;	//�����ȵĸ���
	public void eat(){	//�Է��Ĺ���
		System.out.println("�Է�");
	}
	public void sleep(){	//˯���Ĺ���
		System.out.println("˯��");
	}*/
}