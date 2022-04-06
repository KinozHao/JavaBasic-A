package chouxiang;

public class 程序913抽象类练习老师案例 {
	public static void main(String[] args) {
		teacher a=new teacher("李老师",19);
		a.teach();
		System.out.println(a.getname()+"..."+a.getage());
		teacher2 a2=new teacher2("刘校长",49);
		a2.teach();
		System.out.println(a2.getname()+"..."+a2.getage());
	}
}
abstract class school{
	private String name;//Member variables
	private int age;	//Member variables
	public school(){}	//None parametric structure
	public school(String name,int age){//Yeah parametric structure
		this.name=name;
		this.age=age;
	}
	public void setname(String name){//Method: GetXxx and SetXxx
		this.name=name;
	}
	public String getname(){
		return name;
	}
	public void setage(int age){
		this.age=age;
	}
	public int getage(){
		return age;
	}
	public abstract void teach();
}
class teacher extends school{//son inheritance father
	public teacher(){}//None parametric structure
	public teacher(String name,int age){//Yeah parametric structure
		super(name,age);//super transfer father class
	}
	public void teach(){//school force override
		System.out.println("基础班老师");
	}
}
class teacher2 extends school{//son inheritance father
	public teacher2(){}
	public teacher2(String name,int age){
		super(name,age);//super transfer father class
	}
	public void teach(){
		System.out.println("就业班老师");
	}
}