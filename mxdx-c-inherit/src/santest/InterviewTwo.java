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
			System.out.println("��̬����� santest.fuu");
	}
	{
		System.out.println("�������� santest.fuu");
	}
	public fuu(){
		System.out.println("���췽�� santest.fuu");
		}
	}
	class zii extends fuu{
		static{
			System.out.println("��̬����� santest.zii");
	}
	{
		System.out.println("�������� santest.zii");
	}
	public zii(){
		System.out.println("���췽�� santest.zii");
		}
	}
