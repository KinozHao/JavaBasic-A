package opérateur;
//算数运算符
public class AriTest {
    public static void main(String[] args) {

        arithMethod();//算数运算符实现
        airthExerMethod();//算数运算符题目


    }

    private static void arithMethod() {
        //%取余运算
        //结果的符号与被模数的符号相同
        //开发中常用%来判断是否能被除尽的情况
        int m1 =12;
        int n1 = 5;
        System.out.println("m1 % n1 = " + m1 % n1);
        int m2 = -12;
        int n2 = 5;
        System.out.println("m1 % n1 = " + m2 % n2);
        int m3 =12;
        int n3 = -5;
        System.out.println("m1 % n1 = " + m3 % n3);
        int m4 = -12;
        int n4 = -5;
        System.out.println("m4 % n4 = " + m4 % n4);

        System.out.println("分割线——————————————————————");

        //前++ 后++
        int NUM1 = 10;
        int NUM2 = ++NUM1;
        System.out.println("N1="+NUM1+"\nN2="+NUM2);

        int NUM3 = 10;
        int NUM4 = NUM3++;
        System.out.println("N3="+NUM3+"\nN4="+NUM4);
        //前-- 后--

        //ATTENTION
        //强制转换
        short s0 = 1;
        s0 = (short)(s0+1);
        System.out.println("强转结果:"+s0);

        //类型转换为了int
        short t0 = 1;
        int t1 = t0+1;
        System.out.println("类型转换为int结果:"+t1);

        //这种写法不会改本身的数据类型
        short s1 =1;
        s1--;
        System.out.println("算数运算符结果:"+s1);
    }

    private static void airthExerMethod() {
        /**
         *   算数运算符
         *   随意给出一个整数 打印显示它的个位，十位，百位的值
         * */
        int a = 123;
        int bai = a / 100;
        int shi = a % 100 / 10;
        int ge = a % 10;
        System.out.println("百位："+bai);
        System.out.println("十位："+shi);
        System.out.println("个位："+ge);
    }

}
