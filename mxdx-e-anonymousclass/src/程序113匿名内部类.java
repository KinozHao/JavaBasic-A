public class ����113�����ڲ��� {
	public static void main(String[] args) {
		oo bb =new oo();
		bb.method();
	}
}
interface a{			//�ӿ�
	public abstract void jieko();	//����
}
class oo {
	class i implements a{	//�ڲ���ʵ�ֽӿ�
		public void jieko(){
			System.out.println("A new year in 2019");
		}
	}
	public void method(){	//�ⲿ�෽���½��ڲ������,ʵ���ڲ��෽��
//		i aa=new i();
//		aa.jieko();
		new i().jieko();	//���i �� a��������� ���ñ���ķ��� ��ӡ���Ϊ2019
//����������������������������������������������������������������������������������������������������������������������������������������������������������������
		new a(){			//ʵ�ֽӿ�
			public void jieko(){//��д���󷽷�
				System.out.println("A new year in 2021");
			}
		}.jieko();//����.jieko֮�������Ŀ��Կ����ӿ�a���������
	}
}
