package sitest;

/**
*@apiNote Ա������ϰ
* */

public class StaffView {
	public static void main(String[] args) {
		method(new Manager());
		method2(new UiEngineer());
	}
	public static void method(Manager a){//��������
		a.setname("������");
		a.setid("8795");
		a.setsalary(80000);
		a.setbonus("3W");
		System.out.println("����:"+a.getname()+" ID:"+a.getid()+" н��:"+a.getsalary());
		System.out.println("����:"+a.getbonus());
	}
	public static void method2(UiEngineer b){//��������
		b.setname("С��");
		b.setid("6456");
		b.setsalary(50);
		System.out.println("����:"+b.getname()+" ID:"+b.getid()+" н��:"+b.getsalary());
	}
}
abstract class Staff {
	private String name;	//��Ա����
	private String id;		//��Ա����
	private double salary;	//��Ա����
	public Staff(){}		//�ղι���
	public Staff(String name, String id, double salary){//�вι���
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void setname(String name){	//��������
		this.name=name;
	}
	public String getname(){			//��ȡ����
		return name;
	}
	public void setid(String id){		//����id
		this.id=id;
	}
	public String getid(){				//��ȡid
		return id;
	}
	public void setsalary(double salary){//����salary
		this.salary=salary;
	}
	public double getsalary(){			//��ȡsalary
		return salary;
	}
	public abstract void work();		//���󷽷�
}
class Manager extends Staff {			//�Ӽ̳и�
	private String bonus;
	public void setbonus(String bonus){
		this.bonus=bonus;
	}
	public String getbonus(){
		return bonus;
	}
	public Manager(){}
	public Manager(String name, String id, double salary){
		super(name,id,salary);
	}
	public void work(){
		System.out.println("My job is to manage the peoples");
	}
}
class UiEngineer extends Staff {		//�Ӽ̳и�
	public UiEngineer(){}				//�ղι���
	public UiEngineer(String name, String id, double salary){//�вι���
		super(name,id,salary);			//super���ʸ���
	}
	public void work(){					//���󷽷�
		System.out.println("My job is to ride the code");
	}
}