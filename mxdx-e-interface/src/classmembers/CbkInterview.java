package classmembers;

public class CbkInterview {
	static{
		//��̬�����������������ִ��
		System.out.println("��̬�����");
	}
	public static void main(String[] args) {
		System.out.println("Main�������");
		Student s1=new Student();
		Student s2=new Student();
	}

}
class Student {
	static{
		System.out.println("Students ��̬�����");
	}
	{
		System.out.println("Students ��������");
	}
	public Student(){
		System.out.println("Students ���췽��");
	}
}