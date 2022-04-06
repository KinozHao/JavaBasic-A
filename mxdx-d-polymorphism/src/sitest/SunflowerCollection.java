package sitest;

/**
* @apiNote 葵花宝典小练习
* */

public class SunflowerCollection {
	public static void main(String[] args) {
		mathod(new liuke());
		mathod(new leke());
	}
	public static void mathod(kuihuabook s){//方法调用父类
		s.begins();
	}

}
abstract class kuihuabook{		//抽象类
	public abstract void begins();//抽象方法
}
class liuke extends kuihuabook{	//子继承父
	public void begins(){		//override
		System.out.println("very hard for learning");
	}
}
class leke extends kuihuabook{	//子继承父
	public void begins(){		//override
		System.out.println("Not so hard also like to play");
	}
}