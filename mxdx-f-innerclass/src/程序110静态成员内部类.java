public class ����110��̬��Ա�ڲ��� {
	public static void main(String[] args) {
//		�½�����ĸ�ʽ��: �ⲿ����.�ڲ����� ������=new �ⲿ����.�ڲ������();
		j.x a=new j.x();
		a.method();
		j.x2.print();
	}
}
class j{		//�ⲿ��
	static class x{	//��̬�ڲ���
		public void method(){	//�ڲ��෽��
			System.out.println("Hello world");
		}
	}
	static class x2{	//��̬�ڲ���
		public static void print(){
			System.out.println("print");
		}
	}
}
