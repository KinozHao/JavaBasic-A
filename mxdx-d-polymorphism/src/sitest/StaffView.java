package sitest;

/**
*@apiNote Ա������ϰ
* */

public class StaffView {
	public static void main(String[] args) {
		method(new Manager("�ɾ���","8795",80000,30000));
		method(new UiEngineer("С��","6400",50));
	}
	public static void method(Staff staff){
		System.out.print(staff.info()+" ");

		/**
		* @apiNote ������Ϊ�˵����������еķ���
		* */
		if (staff instanceof Manager){
			Manager manager = (Manager)staff;
			manager.position();
		}

		if (staff instanceof UiEngineer){
			UiEngineer uiEngineer = (UiEngineer)staff;
			uiEngineer.position();
		}
	}

}
abstract class Staff {
	private String name;	//����
	private String id;		//Ա����
	private double salary;	//����
	public Staff(){}
	public Staff(String name, String id, double salary){//�вι���
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public String info(){
		return "����Ƽ����޹�˾Ա��";
	}

	public String getname(){			//��ȡ����
		return name;
	}
	public String getid(){				//��ȡid
		return id;
	}
	public double getsalary(){			//��ȡsalary
		return salary;
	}
}
class Manager extends Staff {			//�Ӽ̳и�
	private int bonus;				//������������

	public int getbonus(){
		return bonus;
	}
	public Manager(){}
	public Manager(String name, String id, double salary,int bonus){
		super(name,id,salary);
		this.bonus = bonus;
	}
	@Override
	public String info(){
		return "����: "+ getname()+" ID:"+ getid()+" н��:"+ getsalary()+" ����:"+ getbonus();
	}

	//�������з���
	public void position(){
		System.out.println("��Ʒ����");
	}
}
class UiEngineer extends Staff {		//�Ӽ̳и�
	public UiEngineer(){}
	public UiEngineer(String name, String id, double salary){//�вι���
		super(name,id,salary);
	}

	@Override
	public String info(){
		return "����: "+ getname()+" ID:"+ getid()+" н��:"+ getsalary();
	}
	//�������з���
	public void position(){
		System.out.println("������");
	}
}