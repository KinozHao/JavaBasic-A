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

        //判断是否相等
        boolean isEquals = gts.equalsArea(c1,c2);
        System.out.println("c1和c2的面积相等吗"+isEquals);


    }

    //判断两个矩形的面积是否相同
    public boolean equalsArea(GeometricObject gto1,GeometricObject gto2){
        return  gto1.findArea() == gto2.findArea();
    }

    //显示对象的面积
    public void  showArea(GeometricObject got){
        System.out.println("面积是："+got.findArea());
    }

}
