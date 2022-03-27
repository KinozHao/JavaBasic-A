package whilexunhuan;

import java.util.Scanner;

//死循环
public class dealCircle {
    /*
    * 题目要求：(用for和while随即一种实现)
    * 键盘录入随机的整数或者负数
    * 当输入值为0的时候停止程序
    * 分别输出整数的个数和复数的个数
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveNum = 0;
        int negativeNum = 0;
        //while (true){}    //while死循环格式
        for (;;) {
            System.out.println("输入数值:");
            int number = sc.nextInt();
            if (number > 0 ){
                positiveNum++;
            }else if (number < 0){
                negativeNum++;
            }else {
                break;
            }
        }
        System.out.println("整数个数:"+positiveNum);
        System.out.println("负数个数"+negativeNum);
    }

}
