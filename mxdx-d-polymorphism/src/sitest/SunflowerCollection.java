package sitest;

/**
* @apiNote 葵花宝典小练习
* */

public class SunflowerCollection {
	public static void main(String[] args) {
		//多态的体现,new多个子类对象
		allMethod(new liuke());
		allMethod(new leke());
	}
	public static void allMethod(kuihuabook s){//把抽象类作为形参
		s.begins();
	}

}
abstract class kuihuabook{		//抽象类
	public abstract void begins();//抽象方法
}
class liuke extends kuihuabook{	//子继承父
	@Override
	public void begins(){
		System.out.println("very hard for learning");
	}
}
class leke extends kuihuabook{	//子继承父
	@Override
	public void begins(){
		System.out.println("Not so hard also like to play");
	}
}