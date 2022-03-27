public class 程序116匿名内部类面试题 {
	public  static void main(String []args){
		one s=two.print();	//新建对象 类名调用two类的方法
		s.method();
	}
}
interface one{		//接口
	void method();
}
class two{			//two类
	public static one print(){	//主方法里面可以类名.调用说明是static静态 返回值类型是one 
		return new one(){		//返回接口的子类对象
			public void method(){	//重写接口里面的method方法
				System.out.println("Hello world");
			}
		};
	}
}