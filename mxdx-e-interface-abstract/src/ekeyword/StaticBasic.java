package ekeyword;

import org.junit.Test;

/**
 * @apiNote static�ؼ���ʹ��
 * */

public class StaticBasic {

	@Test
	public void countryTest() {
		National.country = "�й�";	//��̬����������������

		National national = new National();
		national.name = "����";
		national.info();

		National national2 = new National();
		national2.name = "������";
		national2.info();
	}



}
class National {
	String name;
	static String country;	//��̬����
	public void info(){
		System.out.println("����:"+ name + " ����:"+ country);
	}
}
