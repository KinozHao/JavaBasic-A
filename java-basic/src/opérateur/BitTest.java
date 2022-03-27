package opérateur;
//位运算符
public class BitTest {
    public static void main(String[] args) {
        methodBit();


    }

    private static void methodBit() {
        /**
         * 结论
         * 位运算符操作的都是整型的数据
         * << 在一定范围内，每向左移动1位，相当于*2
         * >> 在一定范围内，每向右移动1位，相当于/2
         */
        int i =21;
        System.out.println("i << 2 :"+(i << 2));
        System.out.println("i << 3 :"+(i << 3));
        System.out.println("i << 26 :"+(i << 26));
        System.out.println("i << 27 :"+(i << 27));

        System.out.println("i >> 2 :"+(i >> 2));
        System.out.println("i >> 26 :"+(i >> 26));

        //如何高效率的计算 2*8
        int y = 2<<3;
        y = 8<<1;
        System.out.println(y);
    }
}
