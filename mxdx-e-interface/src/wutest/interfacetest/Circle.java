package wutest.interfacetest;

/**
 * @author kinoz
 * @date 2022/4/18 - 18:41
 * @apiNote 一个圆的类 声明了半径
 */
public class Circle {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
