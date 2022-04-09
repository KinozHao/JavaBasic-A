package geometrictest;

import org.junit.Test;

/**
 * @author kinoz
 * @date 2022/4/8 - 20:03
 * @apiNote ��̬������ �Լ�Junit��Ԫ���Ե�ʹ��
 */
public class GeometricTest{
    @Test
    public void colorTest(){
        Circle c1 = new Circle("brow");
        Circle c2 = new Circle("brow");
        //�ж���ɫ�Ƿ����  һ��Ҫ�Ȼ�ȡ��ɫ��ȥequals���бȽ�
        System.out.println("c1��c2����ɫ��ͬ��?"+c1.getColor().equals(c2.getColor()));

    }

    @Test
    public void areaTest(){
        GeometricTest gts = new GeometricTest();
        Circle c1 = new Circle(4.0);
        Circle c2 = new Circle(3.0);
        gts.showArea(c1);
        gts.showArea(c2);

        //�ж�����Ƿ����
        boolean isEquals = gts.equalsArea(c1,c2);
        System.out.println("c1��c2����������"+isEquals);

    }

    @Test
    public void equalsAndToStringTest(){
        Circle c1 = new Circle(4.0);
        Circle c2 = new Circle(2.0);

        //��д��equals�������ǱȽ�radius����˵����Ҫget������
        System.out.println("c1��c2�İ뾶��ͬ��?"+c1.equals(c2));

        //��д��toString�󷵻����Զ����ǵ�ֵַ��
        System.out.println(c1);
        System.out.println(c2);
    }


    //�ж��������ε�����Ƿ���ͬ
    public boolean equalsArea(GeometricObject gto1, GeometricObject gto2){
        return  gto1.findArea() == gto2.findArea();
    }

    //��ʾ��������
    public void  showArea(GeometricObject got){
        System.out.println("����ǣ�"+got.findArea());
    }

}
