package wutest.abstracttest;
/**
 * @author kinoz
 * @date 2022��4��16��21��55��
 * @apiNote �������ʦ����ϰ
 */
abstract class School {
	private String name;//Member variables
	private int age;	//Member variables
	public School(){}	//None parametric structure
	public School(String name, int age){//Yeah parametric structure
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
class teacher extends School {//son inheritance father
	public teacher(){}//None parametric structure
	public teacher(String name,int age){//Yeah parametric structure
		super(name,age);//super transfer father class
	}
	public void teach(){//School force override
		System.out.println("��������ʦ");
	}
}
class teacher2 extends School {//son inheritance father
	public teacher2(){}
	public teacher2(String name,int age){
		super(name,age);//super transfer father class
	}
	public void teach(){
		System.out.println("��ҵ����ʦ");
	}
}