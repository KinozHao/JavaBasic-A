package santest;

public class InterviewOne {
	public static void main(String[] args) {
		zis s=new zis();
		s.show();
	}

}
class fus{
	int num=10;
	public fus(){
		System.out.println("fu");
	}
}
class zis extends fus{
	int num=20;
	public zis(){
		//�˵�������super();��Ҫ����
		//������ǰ�����ں�
		System.out.println("zi");
	}
	public void show(){
		int num=30;
		System.out.println(num);//�ͽ�ԭ��
		System.out.println(this.num);//���ñ���
		System.out.println(super.num);//���ø���
	}
}
