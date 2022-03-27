package algorithm;

public class Reverse {

	public static void main(String[] args) {
		//1 定义数组
		int [] arr={90,80,70,60,50,46};


		//2 方法一 对数组遍历并进行交换
/*		for (int i = 0; i < arr.length/2; i++) {	// /2是交换两次
			int temp = arr[i];
			arr[i] =arr[arr.length - i -1];	//数组的长度比索引大1，所以要减去1
			arr[arr.length-i-1] = temp;
		}*/

		//2.1 方法二
		for (int i = 0,j = arr.length-1;i<j;i++,j--){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		/* while的写法
		int i=0;
		while(i<arr.length/2){
		int oxo=arr[i];
		arr[i]=arr[arr.length-1-i];//数组的长度比索引大1，所以要减去1
		arr[arr.length-1-i]=oxo;
		i++;*/

		//3 数组的遍历
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();	//换行语句

	}
}
