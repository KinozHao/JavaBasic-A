package basic;
//��̬�г�Ա�����ص�
public class AboutParam {
	public static void main(String[] args) {
//		one x=new two();//��������ָ���������
//		System.out.println(x.num);
//		two y=new two();
//		System.out.println(y.num);
		one f=new two();
//		f.runs();
		f.funs(); //�����൱��one.funs();
	}
}
//��Ա����	���뿴���(����)	���п����(����)
//��Ա����	���뿴���(����)	���п��ұ�(����) ��̬��
//���뿴���(����),���п����(����)
//��̬�������,�㲻����д,����,���ʻ�����ߵ�
//ֻ�зǾ�̬�ĳ�Ա����,���뿴���,���п��ұ�
class one{
	int num=10;
	public void runs(){//��Ա����
		System.out.println(num);
	}
	public static void funs(){	//��̬��Ա����
		System.out.println("static");
	}
}
class two extends one{
	int num=20;
	public void runs(){			//��Ա����
		System.out.println(num);
	}
}