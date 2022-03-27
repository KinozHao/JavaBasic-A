package yitext.basictest;

/**
 * @author kinoz
 * @date 2022/3/22 - 21:30
 * @apiNote 打印矩形并且输出它的面积
 * @apiNote 更好意义的去理解 形参和有无返回值的区别
 */
public class Rectangle {
    public static void main(String[] args) {
        Rectangle t = new Rectangle();
        t.method1();

        int area = t.method2();
        System.out.println("矩形的面积: "+area);

        int area2 = t.method3(4,4);
        System.out.println("矩形的面积: "+area2);
    }
    public void method1(){  //输出矩形的一个图像
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <8 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int method2(){   //有返回值,为固定数的情况
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <8 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 10*8;
    }

    public int method3( int m , int n){ //有返回值，数字可以自由输入调整矩形的面积
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return m*n;
    }
}
