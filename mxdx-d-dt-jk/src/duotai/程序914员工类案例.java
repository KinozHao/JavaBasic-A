package duotai;

public class ����914Ա���స�� {
	public static void main(String[] args) {
		mathod(new manager());
		mathod2(new programmer());
	}
	public static void mathod(manager a){//��������
		a.setname("������");
		a.setid("8795");
		a.setsalary(80000);
		a.setbonus("3W");
		System.out.println("Name:"+a.getname()+"ID:"+a.getid()+"salary:"+a.getsalary());
		System.out.println("Bonus:"+a.getbonus());
	}
	public static void mathod2(programmer b){//��������
		b.setname("С��");
		b.setid("6456");
		b.setsalary(50);
		System.out.println("Name:"+b.getname()+"ID:"+b.getid()+"salary:"+b.getsalary());
		System.out.println("С���ձ�ҵ��ѧ�� ������5k5������,ϣ������������");
	}
}
abstract class employes{
	private String name;	//��Ա����
	private String id;		//��Ա����
	private double salary;	//��Ա����
	public employes(){}		//�ղι���
	public employes(String name,String id,double salary){//�вι���
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
class manager extends employes{			//�Ӽ̳и�
	private String bonus;				/**��Ա�������影��**/
	public void setbonus(String bonus){
		this.bonus=bonus;
	}
	public String getbonus(){
		return bonus;
	}
	public manager(){}
	public manager(String name,String id,double salary){
		super(name,id,salary);
	}
	public void work(){
		System.out.println("My job is to manage the peoples");
	}
}
class programmer extends employes{		//�Ӽ̳и�
	public programmer(){}				//�ղι���
	public programmer(String name,String id,double salary){//�вι���
		super(name,id,salary);			//super���ʸ���
	}
	public void work(){					//���󷽷�
		System.out.println("My job is to ride the code");
	}
}