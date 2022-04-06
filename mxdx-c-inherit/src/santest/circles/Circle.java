package santest.circles;

/**
 * @author kinoz
 * @date 2022/4/4 - 14:58
 * @apiNote Բ�����
 */
public class Circle {
    private double radius;  //�뾶

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        radius = 1.0;   //��ʼ���뾶
    }

    public double getRadius() { //����Բ�İ뾶
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //����԰�����
    public double findArea(){
        return  Math.PI * radius * radius;
    }
}
