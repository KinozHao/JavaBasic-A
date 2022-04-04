//封装性的基本理解
public class ExtendBasic {
	public static void main(String[] args) {
		cat c = new cat();	//cat自己有方法属性 优先调用自己的方法属性
		c.color = "黑色";
		c.leg = 4;
		c.eat();
		c.sleep();
		System.out.println("猫咪的颜色是"+c.color+",它有"+c.leg+"条腿");
		System.out.println(c.toString());
		System.out.println("--------------------------");

		dog d = new dog();	//dog调用animals的方法
		d.color = "黄色";
		d.leg = 4;
		System.out.println("狗狗的颜色是"+d.color+",它有"+d.leg+"条腿");
	}
}
class animals{//共同的一个类是动物类
	String color;	//动物颜色
	int leg;	//动物腿数
	public void eat(){	//吃饭的功能
		System.out.println("动物吃饭");
	}
	public void sleep(){	//睡觉的功能
		System.out.println("动物睡觉");
	}
}

class cat extends animals{
	public void eat(){	//吃饭的功能
		System.out.println("猫咪吃饭");
	}
	public void sleep(){	//睡觉的功能
		System.out.println("猫咪睡觉");
	}
}

class dog extends animals{ }