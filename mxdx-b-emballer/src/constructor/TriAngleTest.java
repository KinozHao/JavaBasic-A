package constructor;

/**
 * @author kinoz
 * @date 2022/3/28 - 16:10
 * @apiNote 构造器三角形练习
 */
public class TriAngleTest {
    public static void main(String[] args) {
        //无参构造器
        TriAngle te = new TriAngle();
        te.setBase(7);
        te.setHeight(23);
        te.TriAngleArea();
        System.out.println("无参构造:"+te.TriAngleArea());

        //有参构造器
        TriAngle te2 = new TriAngle(23,42);
        System.out.println("有参构造:"+te2.TriAngleArea());
    }
}
class TriAngle{
    private int base;
    private int height;
    public TriAngle(){

    }
    public TriAngle(int b,int h){
        base = b;
        height = h;
    }

    public void setBase(int Tbase) {
        base = Tbase;
    }

    public void setHeight(int Theight) {
        height = Theight;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public String TriAngleArea(){   //三角形面积方法
        return  "TriAngle:"+(base*height)/2+"cm";
    }
}
