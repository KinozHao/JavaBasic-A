public class 程序811继承中的面试题2 {
		public static void main(String[] args) {
			zii s=new zii();//NewObject
		}
	
	}
	//First father class Second Son class
	//Static code block first
	//Structure code block in front of Structure Method
	class fuu{
		static{
			System.out.println("静态代码块 fuu");
	}
	{
		System.out.println("构造代码块 fuu");
	}
	public fuu(){
		System.out.println("构造方法 fuu");
		}
	}
	class zii extends fuu{
		static{
			System.out.println("静态代码块 zii");
	}
	{
		System.out.println("构造代码块 zii");
	}
	public zii(){
		System.out.println("构造方法 zii");
		}
	}
