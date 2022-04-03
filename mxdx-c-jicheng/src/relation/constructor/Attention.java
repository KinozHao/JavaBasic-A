package relation.constructor;

public class Attention {
	public static void main(String[] args) {
		sonss s1=new sonss();//NewObject No parametric structure
		System.out.println(s1.getname()+"..."+s1.getage());
		System.out.println("-------------------");
		sonss s2=new sonss("Kinoz",17);//NewObject Parametric structure
		System.out.println(s2.getname()+"..."+s2.getage());
	}

}
class dads{
	private String name;
	private int age;
	/*public withconstructor.dads(){//No Parametric Structure
		System.out.println("Father No parametric structure");
	}*/
	public dads(String name,int age){//Parametric structure,m
		this.age=age;
		this.name=name;
		System.out.println("Father parametric structure");
	}
	//SetXXX|GetXXX Method
	public void setname(String name){//Set the name
		this.name=name;
	}
	public String getname(){//Get the name
		return name;
	}
	public void setage(int age){//Set the age
		this.age=age;
	}
	public int getage(){//Get the age
		return age;
	}
}
class sonss extends dads{
	public sonss(){//No parametric structure
		//Attantion:also the fathers class first
		//if is's No parametric structure can using "super" method to solutions
//		super("Kinoz",17);
		//we also can using "this"to solution too.
		this("Osaka",15);
		System.out.println("SON NO parametric structure");
	}
	public sonss(String name,int age){//parametric structure
		//this pasition also same as the no parametric hava codearea.a hide here to visit the withconstructor.dads class
		super(name,age);
		System.out.println("Son Parametric structure");
	}
}