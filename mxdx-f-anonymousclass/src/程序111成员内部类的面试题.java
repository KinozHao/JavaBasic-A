//要求以此输出 20 10 30 应该怎么编写此代码
public class 程序111成员内部类的面试题 {
	public static void main(String[] args) {
		fang(new wai().new nei());
	}
	public static void fang(wai.nei a){
		a.method();
	}
}
//内部类之所以能获取得到外部类的成员
//是因为他们能获得到外部类的引用外部类名.this  
class wai{
	int num=30;	//外部类变量
	class nei{
		public int num=10;//内部类变量
		public void method(){
			int num=20;		//方法内的变量
			System.out.println(num);	//就近原则
			System.out.println(this.num);//本类变量 this.调用
			System.out.println(wai.this.num);
		}
	}
}
