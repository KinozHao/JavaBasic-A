package control.ifus;

import java.util.Scanner;
/**
* 算算你家狗年龄多大了？
 * 已知狗的前两年年龄，每年相当于人年龄10.5岁
 * 之后的每一年4岁相当于人的4岁
 * 那么你家的狗多大了快算算吧
* */
public class dogAgeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入狗的年纪");
        Double dogage = sc.nextDouble();
        if (dogage >=0 && dogage <=2){
            System.out.println("相等于人的年龄:"+dogage*10.5);
        }else if (dogage >2){
            System.out.println("相当于人的年龄:"+(2*10.5 + (dogage-2) * 4));
        }else {
            System.out.println("狗狗还没出生");
        }
    }

}
