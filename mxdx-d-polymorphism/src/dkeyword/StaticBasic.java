package dkeyword;
/**
 * @apiNote static关键词使用
 * */
public class StaticBasic {
	public static void main(String[] args) {
		lei k=new lei();//创建对象
		k.name="Kito";//调用姓名属性并且赋值
		k.country="japan";//调用国际属性并且赋值
		k.runs();//调用runs打印语句


		lei k2=new lei();
		k2.name="成周洲";
		k2.runs();//调用runs打印语句
		lei.country="Japan";//静态多了一种调用,可以通过类名
	}

}
class lei{
	String name;
	static String country;//静态只能访问静态变量 静态只能访问静态方法
	public void runs(){//打印语句
		System.out.println(name+"..."+country);
	}
}
