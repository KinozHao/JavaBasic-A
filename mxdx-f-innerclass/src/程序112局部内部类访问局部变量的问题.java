public class ����112�ֲ��ڲ�����ʾֲ����������� {
	public static void main(String[] args) {
		ones x= new ones();
		x.method();
	}
}
//�ֲ��ڲ���,ֻ���������ڵķ����з���
class ones{
	public void method(){	//method�������������һ��twice�� 
		final int NUM=100;	//final���� NUM�ͳ�Ϊ��һ������
		class twice{
			public void print(){
				System.out.println(NUM);
				System.out.println("Hello world");
			}
		}
		twice s= new twice();	//�ڷ����ڴ����¶���
		s.print();
	}
}
