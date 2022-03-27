package opérateur;
/*        面试题：
        请自己实现两个整数变量的交换
        代码如下：*/
public class ExchangeTest {
    public static void main(String[] args) {
        //用位运算符做交换
            int x=5;
            int y=10;
            x=x^y; //5^10
            y=x^y; //5^10^10
            x=x^y; //5^10^5
            System.out.println(x);
            System.out.println(y);

        //用temp做转换
            int q = 6;
            int w = 8;
            int temp = q;
            q = w;
            w = temp;
            System.out.println(q);
            System.out.println(w);
        /*  使用第三方变量，开发推荐这种temp实现数与数之间的转换
            不使用第三批变量，用位异或的特点来编译代码*/

        }
}
