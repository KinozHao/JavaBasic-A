public class 程序813方法重写概述和应用 {
	public static void main(String[] args) {
		ios8 s=new ios8();//New Object 
		s.accept();//成员方法
		s.call();//	成员方法
	}
}
class ios7{
	public void call(){
		System.out.println("打电话");
	}
	public void accept(){
		System.out.println("ios7just can English");
	}
}
class ios8 extends ios7{
	public void accept(){
	//super调用父类成员方法使ios系统可以继续支持English
		super.accept();
	//下列语句新版本的ios支持了对中文的支持
	System.out.println("ios8this version can take with chinese");
	}
}