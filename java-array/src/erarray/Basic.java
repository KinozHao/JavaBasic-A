package erarray;

public class Basic {

	public static void main(String[] args) {
		Basic er = new Basic();
		int [][] a=new int[2][3];
		//这是一个二位数组.
		//这个二维数组中有两个一维数组 
		//三代表每个一位数组中有三个元素
		//int []a,b[];a是一维数组，b是二维数组。
		System.out.println(a);		//打印出二维数组
		System.out.println(a[0]);   //二维数组中的第一个一维数组
		System.out.println(a[0][0]); //二维数组中的第一个一位数组的元素
		/**
		 * 前两个为地址值第三个为默认值
		 * [[I@9945ce//二维数组打印出来的结果有两个[[
		   [I@b5dac4//一维数组打印出来的结果只有一个[[
           0第一个一维数组的默认值或元素值
         */
		System.out.println("==============================");
		System.out.println("The second write");
		er.two();
		System.out.println("==============================");
		System.out.println("The third write");
		er.three();
	}
	public void three(){
		int [][]arr={{1,2},{10,20},{100,200}};
		//这是一个二维数组,这个二维数组中每个大括号都代表一个一维数组
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[0][0]);
		System.out.println(arr[1]);
		System.out.println(arr[1][1]);
	}
	public void two(){
		int [][]a=new int[2][];//有两个一维数组
		a[0]=new int[2];//第一个一维数组可以存储两个元素,都没有被初始化
		a[1]=new int[3];//第二个一维数组可以存储三个元素,都没有被初始化
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
	}

}
