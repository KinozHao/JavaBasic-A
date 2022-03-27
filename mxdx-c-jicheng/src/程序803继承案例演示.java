public class 程序803继承案例演示 {
	public static void main(String[] args) {
		catt c=new catt();
		c.color="black";
		c.leg=4;
		c.eat();
		c.sleep();
		System.out.println(c.color+"..."+c.leg);
	}
}
class animals{//共同的一个类是动物类
	String color;	//动物的颜色
	int leg;	//动物腿的个数
	public void eat(){	//吃饭的功能
		System.out.println("吃饭");
	}
	public void sleep(){	//睡觉的功能
		System.out.println("睡觉");
	}
}
class catt extends animals{
	String color;	//动物的颜色
	int leg;	//动物腿的个数
	public void eat(){	//吃饭的功能
		System.out.println("吃饭");
	}
	public void sleep(){	//睡觉的功能
		System.out.println("睡觉");
	}
}
class dogg extends animals{
	/*String color;	//动物的颜色
	int ieg;	//动物腿的个数
	public void eat(){	//吃饭的功能
		System.out.println("吃饭");
	}
	public void sleep(){	//睡觉的功能
		System.out.println("睡觉");
	}*/
}