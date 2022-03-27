package opérateur;
/**
 * 1
 * 条件表达式的结果为boolean类型
 * 根据表达式的真假，决定执行表达式1，还是表达式2
 * 如果表达式为true 执行表达式1
 * 如果表达式为false 执行表达式2
 * 三元运算符是可以嵌套的
 * 2
 * 凡是可以用三元运算符的地方，都可以改写为if else语句
 * 反之，不成立
 *
 * 3
 * 如果程序既可以使用三元又可以使用if else
 * 优先使用三元 效率更高
*/
public class SanYuanTest {
    public static void main(String[] args) {
        //获取两个整数的最大值
        int a = 1;
        int b = 2;
        int little = (a > b)? a : b;
        System.out.println("最大值: "+little);
        String little2 = (a > b) ? "a大" : "b大";
        System.out.println("谁大: "+little2);
        a++;
        String little3 = (a > b) ? "a小" : ((a == b) ? "相等" : "a大");
        System.out.println("a小于/等于/大于b?,打印结果: "+little3);

        //获取三个数的最大值
        int q = 30;
        int w = 20;
        int s = -49;
        int max = (q > w) ? q : w;
        int max2 = (max > s) ? max : s;
        System.out.println("三数中最大的是: "+max2);

        //不推荐这种写法阅读性太差
        int max3 = (((q > w) ? q : w ) > s) ? ((q > w) ? q : w ) : s;
        System.out.println("三数中最大的是: "+max3);



    }
}
