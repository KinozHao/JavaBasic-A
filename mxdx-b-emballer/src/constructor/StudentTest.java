package constructor;

public class StudentTest {
	public static void main(String[] args) {
		student c=new student();//�޲ι���
		c.getname("Lily");//��������
		c.getage(18);//��������
		System.out.println(c.setname()+"...."+c.setage());
		student c2=new student("Lliy",19);
		c2.show();
	}

}
class student{
	private String name;
	private int age;
	public student(){//�޲ι���
		
	}
	public student(String name,int age){//�вι���
		this.age=age;	//��ֵ this���ֳ�Ա�����;ֲ�����
		this.name=name;
	}
	public void getname(String name){//��������
		this.name=name;
	}
	public String setname(){
		return name;
	}
	public void getage(int age){//��������
		this.age=age;
	}
	public int setage(){
		return age;
	}
	public void show(){//չʾ���
		System.out.println(name+"..."+age);
	}
}
