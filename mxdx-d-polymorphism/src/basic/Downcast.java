package basic;

/**
 * @apiNote
 * ��̬����ת��
 */


public class Downcast {
	public static void main(String[] args) {
		Persons s=new supermans();//��������ָ����������������ת��
		System.out.println(s.name);
		s.business();
		supermans s2=(supermans)s;//����ת��
		s2.fly();
		
	}

}
class Persons{
	String name="Tesko";
	public void business(){
		System.out.println("Talk business ");
	}
}
class supermans extends Persons{
	public void business(){
		System.out.println("Talk army business for millions$");
	}
	public void fly(){
		System.out.println("Pants out and fly to help people");
	}
}