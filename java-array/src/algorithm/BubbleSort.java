package algorithm;
//冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {45,12,56,32,55,9,2,0};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];  //元素交换
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i=0;i<arr.length;i++){ //数组遍历
            System.out.print(arr[i]+"\t");
        }
    }

}
