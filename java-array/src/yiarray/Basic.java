package yiarray;
import java.util.Arrays;

public class Basic {

	public static void main(String[] args) {

		//1 数组的概述
		int [] aa = new int[3];	//数组的动态初始化
		aa[1] = 10;			//数组的第二个索引赋值
		System.out.println(aa[1]);

		String[] dd = new String[100];	//数组的动态初始化
		dd[3] = "清蒸大白菜";		//数组的第三个索引赋予值
 		System.out.println(dd[3]);
		//总结，数组一旦初始化完成，其长度就固定了



		//2 数组的遍历
 		String[] menu = {"大dd","小dd","bigais","littleais"};
		//1 利用arrays中的toString方法
		System.out.println("arrays方法:"+Arrays.toString(menu));
		//2 利用for循环进行遍历数组
		for (int i = 0; i <menu.length ; i++) {
			System.out.print(menu[i]+" ");
		}
		System.out.println();

		//数组的长度
		System.out.println(menu.length);


	}
}