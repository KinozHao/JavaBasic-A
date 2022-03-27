package algorithm;
//线性查找=基本查找
public class 线性查找 {
	public static void main(String[] args) {
		//1 定义一位数组
		int arr[] = {23, 57, 98, 32, 21};
		//2 要查找的值
		int arrvalue = 23;
		//3 用于语法判断
		boolean isFlag = true;
		//4 遍历并逐个元素对比
		for (int i = 0; i < arr.length; i++) {
			//5 判断是否对应
			//if (dest.equals(datas[i])){     //String类型需用使用equals方法来进行比较
			if (arr[i] == arrvalue){
				System.out.println("The index is:"+i);
				isFlag = false;
				break;
			}
		}
		// 6 若不对应isFlag是不变的执行输出语句
		if (isFlag){
			System.out.println("not find the index.");
		}

	}

}
