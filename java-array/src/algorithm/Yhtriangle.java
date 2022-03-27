package algorithm;
//杨辉三角问题 尚硅谷视频P159,157
public class Yhtriangle {
    public static void main(String[] args) {
        //二维数组打印出一个十行的杨辉三角
        /*
        *题目要求
        * 1 第一行有一个元素，第n行有n个元素
        * 2 每一行的第一个和最后一个元素都是1
        * 2 从第三行开始，对于非第一个元素和最后一个元素的元素
        * yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
        * */

        // 1 声明并初始化二维数组
        int yanghui [][] = new int[10][];

        // 2 给数组的元素赋值
        for (int i = 0; i < yanghui.length ; i++) {
            yanghui[i] = new int [i+1];

            // 2.1 给首末元素赋值
            yanghui[i][0] = yanghui[i][i] = 1;
            // 2.2 给每行的非首末元素赋值
            if (i > 1){
                for (int j = 1; j <yanghui[i].length-1; j++) {    //-1是为了让他不到末行元素 不然会报数组越界异常
                    yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
                }
            }
        }

        // 3 遍历二维数组
        for (int i = 0; i <yanghui.length ; i++) {
            for (int j = 0; j <yanghui[i].length ; j++) {
                System.out.print(yanghui[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
