/**
 * @author kinoz
 * @date 2022/3/27 - 21:19
 * @apiNote ����������
 */
package constructor;

public class ConstructorBasic {

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
