package keyword;
/**
 * @apiNote final���÷�
 * 1���������淶,һ������/�������,��ĸȫ����д,��������м��_
 * 2ǰ׺final�ı�����Ϊ����,��public static����
 * 3static ��̬�Ŀ�������.����
 * 4������ �಻�ܼ̳�
 * 5���η��� ����������д
 * 6���α��� �����ͳ�Ϊ����**/

public class FinalView {
	public static void main(String[] args) {
		FinalB s=new FinalB();
		s.runs();
	}
}
final class FinalA{
	public final void runs(){
		System.out.println("hello world");
	}
}


class FinalB extends Object{
	public static final double PI=3.14;
	final int MAX_NUM=10;//����ֻ�ܸ�ֵһ��
	public void runs(){
		//MAX_NUM=1000;	//����ֱ�ӷ��ʲ��ܸı�
		System.out.println("����һ��������: "+MAX_NUM);
	}
}