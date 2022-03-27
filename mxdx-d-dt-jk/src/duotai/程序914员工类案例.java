package duotai;

public class 程序914员工类案例 {
	public static void main(String[] args) {
		mathod(new manager());
		mathod2(new programmer());
	}
	public static void mathod(manager a){//方法调用
		a.setname("成总理");
		a.setid("8795");
		a.setsalary(80000);
		a.setbonus("3W");
		System.out.println("Name:"+a.getname()+"ID:"+a.getid()+"salary:"+a.getsalary());
		System.out.println("Bonus:"+a.getbonus());
	}
	public static void mathod2(programmer b){//方法调用
		b.setname("小吕");
		b.setid("6456");
		b.setsalary(50);
		System.out.println("Name:"+b.getname()+"ID:"+b.getid()+"salary:"+b.getsalary());
		System.out.println("小吕刚毕业大学生 工资有5k5不错了,希望他继续加油");
	}
}
abstract class employes{
	private String name;	//成员变量
	private String id;		//成员变量
	private double salary;	//成员变量
	public employes(){}		//空参构造
	public employes(String name,String id,double salary){//有参构造
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
class manager extends employes{			//子继承父
	private String bonus;				/**成员方法定义奖金**/
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
class programmer extends employes{		//子继承父
	public programmer(){}				//空参构造
	public programmer(String name,String id,double salary){//有参构造
		super(name,id,salary);			//super访问父类
	}
	public void work(){					//抽象方法
		System.out.println("My job is to ride the code");
	}
}