package ifpanduan;

import java.util.Scanner;

public class scannerThreeNumberSort {
    //三个数从小到大输出
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first number");
        int num1 = sc.nextInt();
        System.out.println("first number");
        int num2 = sc.nextInt();
        System.out.println("first number");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){        //假设num1是最大的
            if (num2 > num3){
                System.out.println(num3+" "+num2+" "+num1);
            }else {
                System.out.println(num2+" "+num3+" "+num1);
            }
        }else if (num2 > num1 && num2 > num3){  //假设num2是最大的
            if (num1 > num3){
                System.out.println(num3+" "+num1+" "+num2);
            }else {
                System.out.println(num1+" "+num3+" "+num2);
            }
        }else if (num3 > num1 && num3 > num2){  //假设num3是最大的
            if (num1 > num2){
                System.out.println(num2+" "+num1+" "+num3);
            }else {
                System.out.println(num1+" "+num2+""+num3);
            }
        }
    }

}
