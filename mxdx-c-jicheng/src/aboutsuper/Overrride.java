package aboutsuper;
//方法重写概述和应用
public class Overrride {
	public static void main(String[] args) {
		bmw bm = new bmw();
		bm.drive();
		bm.color();

		bm.autopilot();
	}
}

class car{
	String logo;
	int tel;

	public car(){

	}

	public car(String logo, int tel) {
		this.logo = logo;
		this.tel = tel;
	}

	public void drive(){
		System.out.println("every car can drive");
	}

	public void color(){
		System.out.println("every car have a lot of colors");
	}

	public static void aboutStatic(){	//若声明static子类则不会构成方法的重写
		System.out.println("111");
	}
	public Object aboutParamType(){		//object类型
		System.out.println("objects");
		return null;
	}
}

class bmw extends car{
	//此时构成重写 因为String是object的子类
	@Override
	public String aboutParamType() {
		return null;
	}
	//并没构成方法的重写
	public static void  aboutStatic(){}

	String country;

	public bmw(){

	}

	public bmw(String country) {
		this.country = country;
	}

	//子类对父类方法的重写
	public void color(){
		System.out.println("we supply gold pink white black etc 8 colors for your choose. ");
	}

	public void autopilot(){
		System.out.println("new tec bmw have autopilot car !");
	}
}