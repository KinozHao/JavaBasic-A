package control.ifus;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        scIfMethod();

        //format 1
        int a =133;
        if (a == 123){
            System.out.println("逻辑正确");
        }

        System.out.println("***********************");
        //format 2
        if (a == 9){
            System.out.println("逻辑正确");
        }else{
            System.out.println("逻辑错误");
        }

        System.out.println("***********************");
        //format 3
        int c = 183;
        if (c < 18){
            System.out.println("未成年");
        }else if(c >= 18 && c<=30){
            System.out.println("步入成年");
        }else if (c >=30 && c<= 60){
            System.out.println("步入中年");
        }else if (c >=60 && c<=100){
            System.out.println("步入老龄化");
        }else{
            System.out.println("牛，就一个字牛");
        }
    }

    private static void scIfMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("number:");
        int x = sc.nextInt();
        int y;
        if (x >= 3) {
            y = 2 * x + 1;
            System.out.println(y);
        } else if (-1 < x && x < 3) {
            y = 2 * x;
            System.out.println(y);
        }else if (x <= -1){
            y = 2*x-1;
            System.out.println(y);
        }
    }
}
