package ainterface;
/**
* @apiNote 接口与类之间的关系
* */
public class InterfaceWithClass {

	public static void main(String[] args) {
		//无处不在的多态
		method(new Goo());
	}
	public static void method(Goo goo){
		goo.runs();
		goo.runs2();
		goo.runs3();
	}
}
interface jk1{
	void runs();
}
interface jk2{
	void runs2();
}
//接口与接口可以实现多继承
interface jk3 extends jk1,jk2{
	void runs();
	void runs3();
	void runs2();
}
//实现接口类 可以多实现  格式implements 接口名字,以此类推
class Goo implements jk1,jk2,jk3{
	public void runs(){			//抽象方法规则 强制重写abstract方法
		System.out.println("runs1的输出");
	}
	public void runs2(){		//抽象方法规则 强制重写abstract方法
		System.out.println("runs2的输出");
	}
	public void runs3(){
		System.out.println("runs3的输出");
	}
}
