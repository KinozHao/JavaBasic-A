package constructor;
//ʲô�ǹ�����
public class GouZQ {

	public static void main(String[] args) {
		//�����������þ��Ǵ�������
		Person c=new Person();	//new����ľ��ǹ�����
		//c.Person();		  //���췽�������ö������
		c.runs();
	}

}
class Person{
	//����
	String name;
	private int age;

	//������
	public Person(){
		name="������";
		age=21;
		//��return��䣬���ɲ�д
	}

	//����
	public void runs(){
		System.out.println(name+"�ó�����\n����������"+age);
	}
}
