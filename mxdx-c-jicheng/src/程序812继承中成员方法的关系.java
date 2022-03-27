public class 程序812继承中成员方法的关系 {
	public static void main(String[] args) {
		zisaka s=new zisaka();
		s.print();
		s.method();
	}

}
class fukasi{
	public void print(){
		System.out.println("FU PRINT");
	}
}
class zisaka extends fukasi{
	public void method(){
		System.out.println("ZI METHOD");
	}
	public void print(){
		super.print();//super 调用父类方法
		//因为子类调用父类 所以子类print成员方法先执行 method成员方法后执行
		System.out.println("ZI PRINT");//如果子类和父类有同样的成员方法 将会出现覆盖(重写)。
	}
}