package sitest;

/**
*@apiNote 员工类练习
* */

public class StaffView {
	public static void main(String[] args) {
		method(new Manager("成经理","8795",80000,30000));
		method(new UiEngineer("小吕","6400",50));
	}
	public static void method(Staff staff){
		System.out.print(staff.info()+" ");

		/**
		* @apiNote 以下是为了调用子类特有的方法
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
	private String name;	//名称
	private String id;		//员工号
	private double salary;	//工资
	public Staff(){}
	public Staff(String name, String id, double salary){//有参构造
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public String info(){
		return "机峰科技有限公司员工";
	}

	public String getname(){			//获取名字
		return name;
	}
	public String getid(){				//获取id
		return id;
	}
	public double getsalary(){			//获取salary
		return salary;
	}
}
class Manager extends Staff {			//子继承父
	private int bonus;				//子类特有属性

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
		return "姓名: "+ getname()+" ID:"+ getid()+" 薪资:"+ getsalary()+" 奖金:"+ getbonus();
	}

	//子类特有方法
	public void position(){
		System.out.println("产品经理");
	}
}
class UiEngineer extends Staff {		//子继承父
	public UiEngineer(){}
	public UiEngineer(String name, String id, double salary){//有参构造
		super(name,id,salary);
	}

	@Override
	public String info(){
		return "姓名: "+ getname()+" ID:"+ getid()+" 薪资:"+ getsalary();
	}
	//子类特有方法
	public void position(){
		System.out.println("技术岗");
	}
}