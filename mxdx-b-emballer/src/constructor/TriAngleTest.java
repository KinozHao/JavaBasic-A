package constructor;

/**
 * @author kinoz
 * @date 2022/3/28 - 16:10
 * @apiNote ��������������ϰ
 */
public class TriAngleTest {
    public static void main(String[] args) {
        //�޲ι�����
        TriAngle te = new TriAngle();
        te.setBase(7);
        te.setHeight(23);
        te.TriAngleArea();
        System.out.println("�޲ι���:"+te.TriAngleArea());

        //�вι�����
        TriAngle te2 = new TriAngle(23,42);
        System.out.println("�вι���:"+te2.TriAngleArea());
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

    public String TriAngleArea(){   //�������������
        return  "TriAngle:"+(base*height)/2+"cm";
    }
}
