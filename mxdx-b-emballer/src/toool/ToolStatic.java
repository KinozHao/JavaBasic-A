package toool;

public class ToolStatic {
	//工具类中所有的方法都是静态的 
	//如果一个类中所以的方法都是静态的，需要在多做一步，私有构造方法
	//目的是不让其他类创建本类对象直接用类名.调用即可
	public static void main(String[] args) {
		int [] arr={11,22,33,44,55};
		tools at=new tools();
		int a=at.getMax(arr);//把最大值赋值给a
		System.out.println(a);//打印a“最大值”
		System.out.println("-----------------------");
		at.print(arr);//调用工具类中的数组的遍历方法		打印
		System.out.println();
		System.out.println("-----------------------");
		at.revArry(arr);
		at.print(arr);		//反转
		//text2.getmax(arr);
	}
}
