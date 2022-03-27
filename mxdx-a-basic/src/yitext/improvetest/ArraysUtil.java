package yitext.improvetest;

/**
 * @author kinoz
 * @date 2022/3/24 - 15:32
 * @apiNote 数组工具类
 */
public class ArraysUtil {
    //最大值
    public int getMax(int[] arr){
        int MaxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (MaxValue < arr[i]){
                MaxValue = arr[i];
            }
        }
        return MaxValue;
    }
    public float getMax(float[] arr){
        float MaxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (MaxValue < arr[i]){
                MaxValue = arr[i];
            }
        }
        return MaxValue;
    }
    //最小值
    public int getMin(int[] arr){
        int MinValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (MinValue > arr[i]){
                MinValue = arr[i];
            }
        }
        return MinValue;
    }
    //总和
    public int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }
        return sum;
    }
    //平均值
    public int average(int[] arr){
        //方法调用方法 先知道总和再去和数组的索引相除即可
        return sum(arr)/arr.length;
    }

    //反转
    public void reverse(int[] arr){
		for (int i = 0; i < arr.length/2; i++) {	// /2是交换两次
			int temp = arr[i];
			arr[i] =arr[arr.length - i -1];	//数组的长度比索引大1，所以要减去1
			arr[arr.length-i-1] = temp;
		}
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();	//换行语句
    }

    //冒泡排序
    public void bubble(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    swap(arr,j,j+1);
                }
             }
        }
    }

    //数据交换位置
    public void swap(int arr[],int a,int b){ // a,b此时作为索引
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //数组遍历
    public void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

    //数组复制
    public int[] copy(int[] arr){
        int [] term = new int[arr.length];
        for (int i = 0; i < term.length; i++) {
            term[i] = arr[i];
        }
        return term;
    }

    //线性查找
    public int index(int []arr,int dest){
        for (int i = 0; i < arr.length; i++) {
            //判断是否对应
            if (dest == arr[i]){
                //如果找到返回索引值
                return i;
            }
        }
        return -1; //就是没找到的意思
    }
}
