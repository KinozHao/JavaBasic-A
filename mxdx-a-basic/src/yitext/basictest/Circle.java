package yitext.basictest;

/**
 * @author kinoz
 * @date 2022/3/22 - 9:37
 * @apiNote 求园的面积
 * @apiNote 要素 创建类 写属性方法 调用类 调用类里面属性方法
 */
public class Circle {
    public static void main(String[] args) {
//        调用类
        Test1 c =new Test1();
        //给类方法赋值
        c.radius = 10;
        //调用类方法
        System.out.println(c.getRadius());
    }
}
class Test1 {
    double radius;  //半径
    //园面积方法
    public double getRadius(){
        double area = Math.PI * radius * radius;
        return area;
    }
}
