public class 程序113匿名内部类 {
	public static void main(String[] args) {
		oo bb =new oo();
		bb.method();
	}
}
interface a{			//接口
	public abstract void jieko();	//方法
}
class oo {
	class i implements a{	//内部类实现接口
		public void jieko(){
			System.out.println("A new year in 2019");
		}
	}
	public void method(){	//外部类方法新建内部类对象,实现内部类方法
//		i aa=new i();
//		aa.jieko();
		new i().jieko();	//这个i 是 a的子类对象 调用本身的方法 打印结果为2019
//————————————————————————————————————————————————————————————————————————————————
		new a(){			//实现接口
			public void jieko(){//重写抽象方法
				System.out.println("A new year in 2021");
			}
		}.jieko();//除了.jieko之外其他的可以看作接口a的子类对象
	}
}
