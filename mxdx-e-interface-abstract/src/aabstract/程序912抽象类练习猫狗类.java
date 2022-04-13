package aabstract;

public class 程序912抽象类练习猫狗类 {
	public static void main(String[] args) {
		cats a=new cats(18,"Kafe");	//new Object 
		a.eat();
		a.catchmouse();
		System.out.println(a.getname()+"is about"+a.getage()+"years old");
		System.out.println("--------------------");
		dogs b=new dogs(14,"Nini");
		b.eat();
		b.lookdoor();
		System.out.println(b.getname()+"is about"+b.getage()+"years old");
	}
}
abstract class animals {	//abstract class
	private int age;
	private String name;
	public animals(){	//None parametric structure
	}
	public animals(int age,String name){	//parametric structure
		this.age=age;
		this.name=name;
	}
	public void setage(int age){	//method setxxx and getxxx
		this.age=age;
	}
	public int getage(){
		return age;
	}
	public void setname(String name){
		this.name=name;
	}
	public String getname(){
		return name;
	}
	public abstract void eat();	//abstract class
}
class cats extends animals{	//cats inheritance animals
	public cats(){}			//None parametric structure
	public cats(int age,String name){//parametric structure
		super(age,name);	//super transfer animals class
	}
	public void eat(){		//animals FORCE OVERRIDE
		System.out.println("Fish mouse and ect.");
	}
	public void catchmouse(){//Special just in cats class
		System.out.println("The cat catch the mouse");
	}
}
class dogs extends animals{	//dogs inheritance animals
	public dogs(){}			//None parametric structure
	public dogs(int age,String name){//parametric structure
		super(age,name);
	}
	public void eat(){		//animals FORCE OVERRIDE
		System.out.println("Meet bone and ect");
	}
	public void lookdoor(){//Special just in dogs class
		System.out.println("The dogs look the door");
	}
}
