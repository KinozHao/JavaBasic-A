package keypoint;

public class AnonymousObject {
	//���������ʹ��
	public static void main(String[] args) {
		/*basic.keypoint.money num=new basic.keypoint.money();//���������ֵĶ���
		num.print();
		num.print();
		new basic.keypoint.money().print();//��������ֻ�ʺ϶Է�����һ�ε���,ӦΪ���ö�ξͻ�����������,������������
		new basic.keypoint.money().print();*/ //����������÷���
		new money().country="USD";
		new money().how=100;
		new money().print();
	}
}
class money{
	String country;
	int how;
	public void print(){
		System.out.println(country+".go."+how);
	}
}
