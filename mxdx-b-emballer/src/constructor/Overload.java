package constructor;
//���췽��������
public class Overload {
	public static void main(String[] args) {
		//ʹ�ù��������д���
		people p = new people("Jim",20);

	}
}
class people{
	private String name;
	private int age;
	//�����������͹����˹�����������
	public people(){
		System.out.println("�ղεĹ���");
	}
	public people(String names,int ages){
		name = names;
		age = ages;
		System.out.println("�вεĹ���");
		System.out.println("����"+name+" ����"+age);
	}

}
