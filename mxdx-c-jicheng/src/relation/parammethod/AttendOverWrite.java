package relation.parammethod;
//������д��ע������
public class AttendOverWrite {
	public static void main(String[] args) {
		oth s=new oth();
		s.sing();
		s.getgirl();
	}
}
class shuangjiang{
	public void sing(){
		System.out.println("�����");
	}
	//���Ϊprivate�Ͳ��ܱ�����
	public void getgirl(){
		System.out.println("�����㶨easygirl");
	}
}
class oth extends shuangjiang{
	public void getgirl(){
		super.getgirl();
		System.out.println("����Ӳ�Ϲ�");
	}
}