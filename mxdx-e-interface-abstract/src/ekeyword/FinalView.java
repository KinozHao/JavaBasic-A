package ekeyword;
/**
 * @apiNote final���÷�
 * 1���������淶,PARAM_LIKE_THIS
 * 2final���εı�����Ϊ����,����public static����
 * 4������ �಻�ܼ̳�	���η��� ����������д	���α��� �ͳɳ���
 * **/

public class FinalView {
	public static void main(String[] args) {
		FinalB s = new FinalB();
		s.runs();
	}
}
final class FinalA{
	public final void runs(){
		System.out.println("hello world");
	}
}


class FinalB extends Object{
	public static final double PI = 3.14;
	final int MAX_NUM = 10;//����ֻ�ܸ�ֵһ��
	public void runs(){
		//MAX_NUM=1000;	//����ֱ�ӷ��ʲ��ܸı�
		System.out.println("����һ��������: "+MAX_NUM);
	}
}