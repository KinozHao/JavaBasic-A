package santest;

public class InterviewOne {
	public static void main(String[] args) {
		zis s=new zis();
		s.show();
	}

}
class fus{
	int num=10;
	public fus(){
		System.out.println("fu");
	}
}
class zis extends fus{
	int num=20;
	public zis(){
		//此地隐藏了super();不要忘记
		//父类在前子类在后
		System.out.println("zi");
	}
	public void show(){
		int num=30;
		System.out.println(num);//就近原则
		System.out.println(this.num);//调用本类
		System.out.println(super.num);//调用父类
	}
}
