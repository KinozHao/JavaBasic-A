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

	@Override
	public String toString() {
		return "School{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
class Teacher extends School {//son inheritance father
	public Teacher(){}//None parametric structure
	public Teacher(String name,int age){//Yeah parametric structure
		super(name,age);//super transfer father class
	}
	public void teach(){//School force override
		System.out.println("�ձ�ҵ����ʦ");
	}
}
class Teacher2 extends School {//son inheritance father
	public Teacher2(){}
	public Teacher2(String name, int age){
		super(name,age);//super transfer father class
	}
	public void teach(){
		System.out.println("�꼶����");
	}
}