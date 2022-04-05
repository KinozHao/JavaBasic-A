package santest;

public class InterviewTwo {
		public static void main(String[] args) {
			zii s=new zii();//NewObject
		}
	
	}
	//First withparam.father class Second Son class
	//Static code block first
	//Structure code block in front of Structure Method
	class fuu{
		static{
			System.out.println("静态代码块 santest.fuu");
	}
	{
		System.out.println("构造代码块 santest.fuu");
	}
	public fuu(){
		System.out.println("构造方法 santest.fuu");
		}
	}
	class zii extends fuu{
		static{
			System.out.println("静态代码块 santest.zii");
	}
	{
		System.out.println("构造代码块 santest.zii");
	}
	public zii(){
		System.out.println("构造方法 santest.zii");
		}
	}
