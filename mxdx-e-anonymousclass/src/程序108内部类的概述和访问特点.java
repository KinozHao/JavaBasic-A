public class ����108�ڲ���ĸ����ͷ����ص� {
	public static void main(String[] args) {
		outer.inter oi=new outer().new inter();//�����ڲ������
		oi.method();				//��������
	}
}
class outer{	//�ⲿ��
	public static final int NUM=10;	//��final���εĳ���
	class inter{	//�ڲ���
		public void method(){		//�ڲ��෽��
			System.out.println(NUM);
			System.out.println("Hello word");
		}
	}
}
