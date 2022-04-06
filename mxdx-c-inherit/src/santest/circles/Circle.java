package santest.circles;

/**
 * @author kinoz
 * @date 2022/4/4 - 14:58
 * @apiNote 圆的面积
 */
public class Circle {
    private double radius;  //半径

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        radius = 1.0;   //初始化半径
    }

    public double getRadius() { //返回圆的半径
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //返回园的面积
    public double findArea(){
        return  Math.PI * radius * radius;
    }
}
