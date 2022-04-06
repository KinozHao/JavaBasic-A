public class 程序109成员内部类私有使用 {
	public static void main(String[] args) {
	oo b=new oo();	//新建对象
	b.method();		//方法调用
	}
}
class o{	//外部类
	private class i{	//被private的内部类
		public void print(){	//内部类方法
			System.out.println("Hello world");
		}
	}
	public void method(){	//外部类方法调用内部类
		i a=new i();
		a.print();
	}
}

