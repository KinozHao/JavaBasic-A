package sitest;

/**
 * @author kinoz
 * @date 2022/4/8 - 20:03
 * @apiNote
 */
public class GeometricTest{
    public static void main(String...args){
        GeometricTest gts = new GeometricTest();
        Circle c1 = new Circle("brow",1.0,3.0);
        gts.showArea(c1);
        Circle c2 = new Circle("white",1.0,3.0);
        gts.showArea(c2);

        //�ж��Ƿ����
        boolean isEquals = gts.equalsArea(c1,c2);
        System.out.println("c1��c2����������"+isEquals);


    }

    //�ж��������ε�����Ƿ���ͬ
    public boolean equalsArea(GeometricObject gto1,GeometricObject gto2){
        return  gto1.findArea() == gto2.findArea();
    }

    //��ʾ��������
    public void  showArea(GeometricObject got){
        System.out.println("����ǣ�"+got.findArea());
    }

}
