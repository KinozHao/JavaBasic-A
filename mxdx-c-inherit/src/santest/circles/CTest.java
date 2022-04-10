package santest.circles;

import org.junit.Test;

/**
 * @author kinoz
 * @date 2022/4/4 - 15:11
 * @apiNote Բ����Ĳ���
 */
public class CTest {

    @Test
    public void CircleTest(){
        Circle ce = new Circle(3.5);
        //��Բ�����
        double area = ce.findArea();
        System.out.println("Circle area: "+area);

    }

    @Test
    public void CylinderTest(){
        Cylinder cr = new Cylinder();
        cr.setRadius(1.5);
        cr.setLength(2.43232252223);
        //Բ�������
        double Volume = cr.findVolume();
        System.out.println("Cylinder volume: "+Volume);
        //Բ���ı����
        double area = cr.findArea();
        System.out.println("Cylinder surface area:"+area);
    }
}
