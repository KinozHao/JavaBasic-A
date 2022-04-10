package santest.circles;

import org.junit.Test;

/**
 * @author kinoz
 * @date 2022/4/4 - 15:11
 * @apiNote 圆柱类的测试
 */
public class CTest {

    @Test
    public void CircleTest(){
        Circle ce = new Circle(3.5);
        //求圆的面积
        double area = ce.findArea();
        System.out.println("Circle area: "+area);

    }

    @Test
    public void CylinderTest(){
        Cylinder cr = new Cylinder();
        cr.setRadius(1.5);
        cr.setLength(2.43232252223);
        //圆柱的体积
        double Volume = cr.findVolume();
        System.out.println("Cylinder volume: "+Volume);
        //圆柱的表面积
        double area = cr.findArea();
        System.out.println("Cylinder surface area:"+area);
    }
}
