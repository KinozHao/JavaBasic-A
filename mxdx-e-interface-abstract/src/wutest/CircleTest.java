package wutest;

/**
 * @author kinoz
 * @date 2022/4/13 - 16:49
 * @apiNote static使用体现
 */
public class CircleTest {


    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1.getId());
        Circle circle2 = new Circle();
        System.out.println(circle2.getId());
        Circle circle3= new Circle(30);
        System.out.println(circle3.getId());

        System.out.println("创建圆个数:"+Circle.getTotal());
    }
}

class Circle{
    private int radius;
    private int id; //圆id
    private static int init = 1001;   //初始化圆id
    private static int total;   //记录创建圆的个数

    public Circle(){
        id = init++;    //每new一个对象id自增一次
        total++;        //每new一个对象总数自增一次
    }

    public Circle(int radius){
        this();
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public int getId() {
        return id;
    }

    public static int getInit() {
        return init;
    }

    public static int getTotal() {
        return total;
    }
}
