package aabstract;

/**
 * @apiNote
 * ��������ص��
 */

public class AbstractBasic {
	public static void main(String[] args) {
		gosss s=new gohome();	//��������ָ���������
		s.gos();
	}
}
abstract class gosss{	//������
	public abstract void gos();	//���󷽷�
}
class gohome extends gosss{
	public void gos(){
		System.out.println("Go ahand this way");
	}
}