public class ����115�����ڲ��࿪������ {
	public static void main(String[] args) {
		persondemo aaa=new persondemo();
		//�����ڲ��൱����������(���ʰ������ڲ��࿴��һ������)
		aaa.print(new person(){			//pirnt������������һ�������ڲ���
			public void method(){		//new person(){};��ʵ�ָ�����󷽷�
				System.out.println("����һ��method����");
			}
		});
	}
}
abstract class person{	//����һ��������
	public void method(){};	//���󷽷�
}	
class persondemo{
	public void print(person a){	//��print�������ó�����ĳ��󷽷�
		a.method();
	}
}