package basic1;

public class incognitoObject {
	//��������incognitoObject
	public static void main(String[] args) {
		/*basic.money num=new basic.money();//���������ֵĶ���
		num.print();
		num.print();
		new basic.money().print();//��������ֻ�ʺ϶Է�����һ�ε���,ӦΪ���ö�ξͻ�����������,������������
		new basic.money().print();*/ //����������÷���
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
