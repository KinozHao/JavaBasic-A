package binterface;

public class ����917�ӿڵĳ�Ա�ص� {

	public static void main(String[] args) {
		goons a=new goons();	//�½�����
		a.print();
		a.wang();
		System.out.println(inters.NUM);//�����������.���� ���Ǿ�̬��
	}
}
interface inters{
	public static final int NUM=10;		//�ӿ��ж���ı������ǳ��� ǰ��Ĭ�ϼ�����final ֵ�޷�����ʵ�ֽӿ����޸�ֵ
	//ͬʱ�ӿڻ��Ǳ�©������ ����ǰ�滹��Ĭ�ϼ�����static 
	//��Ϊ��������.���� ǰ�滹��Ĭ�ϼ�����public
	/*public inters(){}*/				//�ӿ���û�й��췽��
	//public void eat(){}				//�ӿ���ֻ�ܶ���abstract����
	void wang();				//���󷽷��ڽӿ��п�����ôд ϵͳ��Ĭ����� public ��abstract�����Լ��ֶ����
}
class goons extends Object implements inters{	//һ���಻д�̳���Ļ� Ĭ�ϼ̳е���Object��
	public void print(){	//��Ա����
		System.out.println(NUM);
	}
	public void wang(){
		System.out.println("Hello world");
	}
	public goons(){}//�����ʵ���г��ֹ��췽����super�Խӵ���Object�� �������
}
