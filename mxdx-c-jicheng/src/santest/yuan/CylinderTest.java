package santest.yuan;

/**
 * @author kinoz
 * @date 2022/4/4 - 15:11
 * @apiNote 圆柱类的测试
 */
public class CylinderTest {
    public static void main(String[] args) {

        Cylinder cr = new Cylinder();
        cr.setRadius(1.5);
        cr.setLength(2.43232252223);

        double Volume = cr.findVolume();        //圆柱的体积
        System.out.println("Cylinder volume: "+Volume);

        double area = cr.findArea(); //圆柱的表面积
        System.out.println("Cylinder surface area:"+area);

    }
}
