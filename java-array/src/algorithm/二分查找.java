package algorithm;
/**
 * 二分查找(熟悉即可)非递归思想
 * 前提 所查找的数组必须是有序的**/
public class 二分查找 {
    public static void main(String[] args) {
        int[] data2 = {1,6,11,19,35,37,49,59,70};
        int dest2 = 49;	//要查找的值
        int head = 0;	//初始的首索引
        int end = data2.length - 1;	//初始的最后一个索引
        boolean isFlag2  =true;	//对条件语句做出判断
        while (head <= end){
            //int middle = (head + end )/2;         //存在溢出的风险
            int middle = head+(end - head )/2;      //确保算出的middle，一定大于head，小于end，不存在溢出的风险

            if (data2[middle]< dest2){
                head = middle + 1;
            }else if (data2[middle] > dest2){
                end = middle - 1;
            }else {	//
                System.out.println("find out the length num is: "+middle);
                isFlag2 = false;
                break;
            }
        }
        if (isFlag2){
            System.out.println("None find");
        }
    }
}
