public class ����805��ļ̳��ص� {
	public static void main(String[] args) {
		//�鿴���ù����������ഴ������
		c1 d=new c1();//�½�����
		d.show();//���ó�Ա����
		//�鿴���Թ��ܿ�������
		a1 e=new a1();
		e.show();
		
	}
}
class a1{//��1
	public void show(){
		System.out.println("this is a1");
	}
}
class b1 extends a1{//��2
	public void show(){
		System.out.println("this is b1");
	}
}
//Javaֻ֧�ֵ��̳�����˵ extends a1,b��д����ʽ�ǲ��Ե�
class c1 extends b1/*,b*/{//��3�̳�����1��show���������������е���
	public void print(){
		System.out.println("this is c1");
	}
}