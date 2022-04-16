/**
* @apiNote 开发时候很少在创建对象的时候用父类引用指向子类对象,
 * 直接创建子类对象更方便可以使用子类中特有的属性和行为
* */

import org.junit.Test;

public class DuotBasicII {
	@Test
	public void textChina(){	//测试China类输出
		DuotBasicII dl = new DuotBasicII();
		dl.FatherMethod(new China());
	}

	@Test
	public void textJapan(){	//测试Japan类输出
		DuotBasicII dl = new DuotBasicII();
		dl.FatherMethod(new Japan());
	}

	public void FatherMethod(Human human){
		human.person();		//调用为Human 实际输出为子类自己重写后的方法
		human.food();

		////体现向下转型 去调用子类特有的方法
		if (human instanceof Japan){
			Japan jp = (Japan)human;
			jp.wordEasy();
		}

		if (human instanceof China){
			China cn = (China) human;
			cn.workHard();
		}
	}


}
class Human {
	public void person(){
		System.out.println("all of yours are person");
	}

	public void food(){
		System.out.println("a lot of food for you choose");
	}

	/** @apiNote
	 *  若没用多态的体系，声明什么类型，就new什么类型对象
	 * 	就需要写大量的重载方法，代码复用性不高，比较臃肿
	 */
	public void fuc(Japan jp){
		jp.person();
		jp.food();
	}
	public void fuc(China cn){
		cn.person();
		cn.food();
	}
}
class Japan extends Human {
	public void person(){
		System.out.println("I,m japanese");
	}
	public void food(){
		System.out.println("We eat Sushi");
	}
	public void wordEasy(){
		System.out.println("自己的方法 URGENTLY_NEEDED IT engineer 10/6/5！！！");
	}
}
class China extends Human {
	public void person(){
		System.out.println("I,m Chinese");
	}
	public void food(){
		System.out.println("We eat dumping");
	}

	public void workHard(){
		System.out.println("自己的方法 内卷 内卷 Like 996.icu");
	}
}