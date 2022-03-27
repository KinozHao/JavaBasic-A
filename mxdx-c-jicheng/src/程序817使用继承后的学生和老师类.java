public class 程序817使用继承后的学生和老师类 {
	public static void main(String[] args) {
		teacher s=new teacher();
		s.setname("Jack");
		s.setage(23);
		s.sleep();
		s.eat();
		System.out.println(s.getname()+"..."+s.getage());
		System.out.println("----------------------------");
		stuudents s2=new stuudents("Leo",18);
		s.eat();
		s.sleep();
		System.out.println(s2.getname()+"..."+s2.getage());
		
	}

}
class person{
	private String name;
	private int age;
	public person(){}
	public person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void setname(String name){
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
	public void eat(){
		System.out.println("Jack,s eat thinks");
	}
}
class teacher extends person{
	public teacher(){}
	public teacher(String name,int age){
		super(name,age);
	}
	public void sleep(){
		System.out.println(this.getname()+"teacher Go bad sleep");
	}
}
class stuudents extends person{
	public stuudents(){}
	public stuudents(String name,int age){
		super(name,age);
	}
	public void sleep(){
		System.out.println(this.getname()+"students Go bad sleep");
	}
}
