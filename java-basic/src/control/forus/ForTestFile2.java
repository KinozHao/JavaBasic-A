package control.forus;

import java.util.Scanner;

/*
* 输入两个正整数m和n
* 求最大公约数和最小公倍数
* 比如12和20的最大公约数是4，最小公约数是60
* 说明：break关键词的使用
* */
public class ForTestFile2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("输入第一个数字：");
        int m = sc.nextInt();
        System.out.println("输入第二个数字：");
        int n = sc.nextInt();

        //最大公约数
        //1，获取两个数的最小值
        int min = (m <= n)? m:n;
        //2，遍历
        for (int i = min; i >=1 ; i--) {
            if (m % i == 0 && n % i == 0){
                System.out.println("最大公约数是："+i);
                break;//一旦碰到break就跳出循环
            }
        }

        //最小公倍数
        //1，获取两个数的最大值
        int max = (m >= n)? m:n;
        //2，遍历
        for (int i = max; i<=m*n ; i++) {
            if (i % m == 0 && i % n == 0){
                System.out.println("最小公倍数是："+i);
                break;
            }
        }
    }
}
