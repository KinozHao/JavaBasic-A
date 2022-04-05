package santest.yuan;

/**
 * @author kinoz
 * @date 2022/4/4 - 15:04
 * @apiNote 圆柱面积 圆柱表面积
 */
public class Cylinder extends Circle {
    private double length;

    public Cylinder(double length) {
        this.length = length;
    }

    public Cylinder() {
        length = 1.0;   //初始化高
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    //圆柱的面积  底面积*高
    public double findVolume(){
        //调用父类Circle方法
        //return Math.PI * getRadius() *getRadius() * length;
        return  super.findArea() * length;  //通过super调用父类的方法，而不是本身重写过的方法
    }

    //圆柱的表面积
    @Override
    public double findArea() {
        return Math.PI * getRadius() * getRadius() * 2 +
                2 * Math.PI * getRadius() * length;
    }
}
