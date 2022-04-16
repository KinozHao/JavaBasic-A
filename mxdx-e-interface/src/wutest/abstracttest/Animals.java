package wutest.abstracttest;

/**
 * @author kinoz
 * @date 2022年4月16日21点55分
 * @apiNote 抽象的动物类练习
 */

abstract class Animals {	//abstract class
	private int age;
	private String name;
	public Animals(){	//None parametric structure
	}
	public Animals(int age,String name){	//parametric structure
		this.age=age;
		this.name=name;
	}
	public abstract void eat();	//abstract class

	public void setAge(int age){	//method setxxx and getxxx
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

}
class Cats extends Animals {	//Cats inheritance animals
	public Cats(){}			//None parametric structure
	public Cats(int age,String name){//parametric structure
		super(age,name);	//super transfer animals class
	}
	public void eat(){		//animals FORCE OVERRIDE
		System.out.println("Fish mouse and ect.");
	}
	public void catchMouse(){//Special just in Cats class
		System.out.println("The cat catch the mouse");
	}
}
class Dogs extends Animals{	//Dogs inheritance animals
	public Dogs(){}			//None parametric structure
	public Dogs(int age, String name){//parametric structure
		super(age,name);
	}
	public void eat(){		//animals FORCE OVERRIDE
		System.out.println("Meet bone and ect");
	}
	public void lookDoor(){//Special just in Dogs class
		System.out.println("The Dogs look the door");
	}
}
