/**
 * @apiNote
 * �������˼�����Ļ�������
 * ������Ķ���=���ʵ����
 * ��Ͷ����ʹ��
 * 1 �����࣬�����ĳ�Ա 2 ������Ķ��� 3 ͨ������.����/����.���� ���ö���Ľṹ
 * */
public class MxdxBasic {

	public static void main(String[] args) {
		Student s=new Student();	//����Student��Ķ���
			//������Ľṹ ���ԡ�����
			s.age=17;
			s.name="jack james";
			s.gender="male";
		System.out.println(s.name+"..."+s.age+s.gender);
			s.sleep();				//����ѧ��������ķ���
			s.study();
			s.talk("Spanish");
	}

}
class Student{		//ѧ����
	int age;		//����(����)
	String name;
	String gender;
	public void study(){	//��Ϊ(����)
		System.out.println("we also study hole days");
	}
	public void sleep(){
		System.out.println("we also sleep at mindnight to late");
	}
	public void talk(String language){	//�β�
		String building = "No.35";	//�ֲ�����
		System.out.println("just talk with:"+language);
	}
}
