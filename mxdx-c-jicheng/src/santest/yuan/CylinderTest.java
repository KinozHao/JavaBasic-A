package santest.yuan;

/**
 * @author kinoz
 * @date 2022/4/4 - 15:11
 * @apiNote Բ����Ĳ���
 */
public class CylinderTest {
    public static void main(String[] args) {

        Cylinder cr = new Cylinder();
        cr.setRadius(1.5);
        cr.setLength(2.43232252223);

        double Volume = cr.findVolume();        //Բ�������
        System.out.println("Cylinder volume: "+Volume);

        double area = cr.findArea(); //Բ���ı����
        System.out.println("Cylinder surface area:"+area);

    }
}
