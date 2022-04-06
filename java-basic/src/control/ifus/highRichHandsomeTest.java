package control.ifus;

import java.util.Scanner;

//高富帅问题
public class highRichHandsomeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你的身高");
        int high = sc.nextInt();
        System.out.println("你的资产(单位/千万)");
        int rich = sc.nextInt();
        System.out.println("你长得帅吗?(帅/丑)");
        String handsome = sc.next();
        if (high >=180 && rich >=1 && handsome.equals("帅")){
            System.out.println("非嫁不可");
        }else if (high >=180 || rich>=1 || handsome.equals("帅")){
            System.out.println("也可以嫁");
        }else{
            System.out.println("不嫁");
        }
    }
}
