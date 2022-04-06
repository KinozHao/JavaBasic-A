package jiekou;

public class 程序918类和接口的互相关系 {

	public static void main(String[] args) {
		method(new gogo());				//方法实现
	}
	public static void method(gogo s){	//方法
		s.runs();
		s.runs2();
		s.runs3();
	}
}
interface jk1{		//接口
	public abstract void runs();
}
interface jk2{		//接口
	public abstract void runs2();
}
interface jk3 extends jk1,jk2{		//接口与接口可以实现多继承
	public abstract void runs3();
	public void runs();
	public void runs2();
}
class gogo implements jk1,jk2,jk3{	//实现接口类 可以多实现  格式implements 接口名字,以此类推
	public void runs(){			//抽象方法规则 强制重写abstract方法
		System.out.println("GUCCI");
	}
	public void runs2(){		//抽象方法规则 强制重写abstract方法
		System.out.println("Go???");
	}
	public void runs3(){
		System.out.println("Gogo");
	}
}
