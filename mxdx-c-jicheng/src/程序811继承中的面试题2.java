public class ����811�̳��е�������2 {
		public static void main(String[] args) {
			zii s=new zii();//NewObject
		}
	
	}
	//First father class Second Son class
	//Static code block first
	//Structure code block in front of Structure Method
	class fuu{
		static{
			System.out.println("��̬����� fuu");
	}
	{
		System.out.println("�������� fuu");
	}
	public fuu(){
		System.out.println("���췽�� fuu");
		}
	}
	class zii extends fuu{
		static{
			System.out.println("��̬����� zii");
	}
	{
		System.out.println("�������� zii");
	}
	public zii(){
		System.out.println("���췽�� zii");
		}
	}
