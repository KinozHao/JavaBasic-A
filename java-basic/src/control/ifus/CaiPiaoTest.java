package control.ifus;

/**
* 1.假设你想开发一个玩彩票的游戏，程序随机地产 生一个两位数的彩票，提示用户输入一个两位 数，然后按照下面的规则判定用户是否能赢。
* 1)如果用户输入的数匹配彩票的实际顺序，奖金 10 000美元。
* 2)如果用户输入的所有数字匹配彩票的所有数 字，但顺序不一致，奖金 3 000美元。
* 3)如果用户输入的一个数字仅满足顺序情况下匹 配彩票的一个数字，奖金1 000美元。
* 4)如果用户输入的一个数字仅满足非顺序情况下 匹配彩票的一个数字，奖金500美元。
* 5)如果用户输入的数字没有匹配任何一个数字， 则彩票作废。
* */
import java.util.Random;
import java.util.Scanner;

public class CaiPiaoTest {
    public static void main(String[] args) {
        //输入你的彩票号,介于10-99之间
        Scanner sc =new Scanner(System.in);
        System.out.println("输入你的彩票数：");
        int input = sc.nextInt();

        if (input < 10 || input >99){
            System.out.println("请输入10-99的数字");
            return;
        }

        //中奖彩票号
        int r = new Random().nextInt(99 - 10 + 1)+10;
        System.out.println("中奖的号码: "+r);

        //获取随机数的十位和个位
        int sw = r / 10;
        int gw =  r % 10;

        //获取彩票数的十位和个位
        int s = input / 10;
        int g = input % 10;

        int cp = 0; //彩票变量
        if (r == input){
            cp = 10000;
        }else if ((gw == g || sw == s)&&(gw == s || sw == g)){
            cp = 3000;
        }else if (sw == s || gw == g){
            cp = 1000;
        }else if ((gw == g || sw == s) || (gw ==s || sw == g)){
            cp =500;
        }else {
            System.out.println("没有中奖");
        }
        System.out.println("你的中奖金额是"+cp);
    }
}
