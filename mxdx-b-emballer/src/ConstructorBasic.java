public class ConstructorBasic {

	public static void main(String[] args) {
		Person c=new Person();//��һ���������ʱ��,ϵͳ�Ͱ��ҵ����˹��췽��
		//c.Person();		  //���췽�������ö������
		c.runs();
	}

}
class Person{
	private String name;
	private int age;
	//���췽��
	public Person(){
		name="������";
		age=16;
		return;//���췽��Ҳ����return���ģ���ʽ��return;
	}
	public void runs(){
		System.out.println(name+"�ó�����\t������"+age);
	}
}
