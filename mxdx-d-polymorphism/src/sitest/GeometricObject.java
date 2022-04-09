package sitest;

/**
 * @author kinoz
 * @date 2022/4/8 - 19:44
 * @apiNote
 */
public class GeometricObject {
    private String color;   //颜色
    private double weight;  //重量

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public GeometricObject() {
    }

    public double findArea(){
        return 0;
    }
}

class Circle extends GeometricObject{
    private double radius;  //半径

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {  //圆面积公式
        return  Math.PI * radius * radius;
    }
}

class MyRectangle extends GeometricObject{
    private double width;
    private double height;

    public MyRectangle(double width,double height) {
        this.width = width;
        this.height = height;
    }

    public MyRectangle(String color, double weight, double width,double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {  //矩形面积公式
        return height * width;
    }
}


