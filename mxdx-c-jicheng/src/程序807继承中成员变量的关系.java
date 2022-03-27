public class 程序807继承中成员变量的关系 {
	public static void main(String[] args) {
		son s=new son();
		s.runs();
	}
}
class father{
	int num=10;
	int num1=203;
}
class son extends father{
	int num1=20;
	public void runs(){
		System.out.println(this.num);//子父类不同名的变量
		System.out.println(this.num1);//第二句输出为20不为203 为什么 因为就近原则
		System.out.println(super.num1);
		//this调用本类,也可以调用父类(本类没有的情况下) super调用父类
	}
}