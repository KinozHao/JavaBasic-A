public class ����802������������ {
	static{
		System.out.println("����802 ��̬�����");//��̬�����������������ִ��
	}
	public static void main(String[] args) {
		System.out.println("����main����");
		studentss s1=new studentss();
		studentss s2=new studentss();
	}

}
class studentss{
	static{
		System.out.println("Students ��̬�����");
	}
	{
		System.out.println("Students ��������");
	}
	public studentss(){
		System.out.println("Students ���췽��");
	}
}