package recursion;

/**
 * @author kinoz
 * @date 2022/3/25 - 12:20
 * @apiNote 递归问题
 */
public class Recursion {
    public static void main(String[] args) {
        //正常for循环计算
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum +=i;
        }
        System.out.println("正常方法"+sum);

        //递归计算
        Recursion rn = new Recursion();
        int sum2 =rn.dgsum(100);
        System.out.println("递归方法"+sum2);

    }
    //即：计算1-n之间所有自然数的成绩：n!就是n的阶乘
    public int dgsum(int n){
        if (n == 1){
            return 1;
        }else{
            return n+dgsum(n-1);
        }
    }
}
