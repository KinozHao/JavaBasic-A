package sitest;

/**
*@apiNote 员工类练习
* */

public class StaffView {
	public static void main(String[] args) {
		method(new Manager());
		method2(new UiEngineer());
	}
	public static void method(Manager a){//方法调用
		a.setname("成总理");
		a.setid("8795");
		a.setsalary(80000);
		a.setbonus("3W");
		System.out.println("姓名:"+a.getname()+" ID:"+a.getid()+" 薪资:"+a.getsalary());
		System.out.println("奖金:"+a.getbonus());
	}
	public static void method2(UiEngineer b){//方法调用
		b.setname("小吕");
		b.setid("6456");
		b.setsalary(50);
		System.out.println("姓名:"+b.getname()+" ID:"+b.getid()+" 薪资:"+b.getsalary());
	}
}
abstract class Staff {
	private String name;	//成员变量
	private String id;		//成员变量
	private double salary;	//成员变量
	public Staff(){}		//空参构造
	public Staff(String name, String id, double salary){//有参构造
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void setname(String name){	//设置名字
		this.name=name;
	}
	public String getname(){			//获取名字
		return name;
	}
	public void setid(String id){		//设置id
		this.id=id;
	}
	public String getid(){				//获取id
		return id;
	}
	public void setsalary(double salary){//设置salary
		this.salary=salary;
	}
	public double getsalary(){			//获取salary
		return salary;
	}
	public abstract void work();		//抽象方法
}
class Manager extends Staff {			//子继承父
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
class UiEngineer extends Staff {		//子继承父
	public UiEngineer(){}				//空参构造
	public UiEngineer(String name, String id, double salary){//有参构造
		super(name,id,salary);			//super访问父类
	}
	public void work(){					//抽象方法
		System.out.println("My job is to ride the code");
	}
}