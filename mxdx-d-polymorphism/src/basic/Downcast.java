package basic;

/**
 * @apiNote
 * 多态向下转型
 */


public class Downcast {
	public static void main(String[] args) {
		Persons s=new supermans();//父类引用指向子类对象就是向上转型
		System.out.println(s.name);
		s.business();
		supermans s2=(supermans)s;//向下转型
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