package keyword;
//final���� ���� ���� �Ĺ�ϵ
public class FinalBasic {
	public static void main(String[] args) {
		cx819s s=new cx819s();
		s.runs();
	}
}
/*final*/ class cx819{ //������ ���ܼ̳�
	public /*final*/ void runs(){ //���η��� ������д
		System.out.println("hello world");
	}
}
class cx819s /*extends keyword.cx819*/{
	//���������淶,�����һ������,������ĸ��д
	//����������,ÿ�����ʶ���д,�м����»��߸���
	
	//һ��ɱ�final����֮��ı���Ϊ���� ����public static ����ʹ��
	//public ������˭�����Է���  static ��̬�Ŀ�������.���� 
	public static final double PI=3.14;
	final int MAX_NUM=10;//���α����ͱ���˳��� ֻ�ܱ���ֵһ��
	public void runs(){
		//MAX_NUM=1000;	//����ֱ�ӷ��ʲ��ܸı�	
		System.out.println(MAX_NUM);
		System.out.println("Noway hello world");
	}
}