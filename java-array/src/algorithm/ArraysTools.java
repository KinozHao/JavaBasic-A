package algorithm;
//Arrays工具类的使用
import java.util.Arrays;

public class ArraysTools {
    public static void main(String[] args) {
        int arr[] = {23,45,11,35,737,432,6342,643};

        Arrays.sort(arr);   //数组排序

        System.out.println(Arrays.toString(arr));   //数组遍历

        System.out.println(Arrays.binarySearch(arr,45));    //获取索引
    }
}
