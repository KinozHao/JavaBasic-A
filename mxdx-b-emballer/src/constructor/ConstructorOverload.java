package constructor;
//���췽���������Լ�ע������
public class ConstructorOverload {
	public static void main(String[] args) {
	people p1=new people();
	p1.show();
	System.out.println("__________________________");
	people p2=new people("Lliy",29);
	p2.show();
	}
}
class people{
	private String name;
	private int age;
	public people(){
		System.out.println("�ղεĹ���");
	}
	public people(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("�вεĹ���");
	}
	public void show(){
		System.out.println(name+"..."+age);
	}
}
