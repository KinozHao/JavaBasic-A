public class ����116�����ڲ��������� {
	public  static void main(String []args){
		one s=two.print();	//�½����� ��������two��ķ���
		s.method();
	}
}
interface one{		//�ӿ�
	void method();
}
class two{			//two��
	public static one print(){	//�����������������.����˵����static��̬ ����ֵ������one 
		return new one(){		//���ؽӿڵ��������
			public void method(){	//��д�ӿ������method����
				System.out.println("Hello world");
			}
		};
	}
}