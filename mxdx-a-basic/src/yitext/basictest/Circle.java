package yitext.basictest;

/**
 * @author kinoz
 * @date 2022/3/22 - 9:37
 * @apiNote ��԰�����
 * @apiNote Ҫ�� ������ д���Է��� ������ �������������Է���
 */
public class Circle {
    public static void main(String[] args) {
//        ������
        Test1 c =new Test1();
        //���෽����ֵ
        c.radius = 10;
        //�����෽��
        System.out.println(c.getRadius());
    }
}
class Test1 {
    double radius;  //�뾶
    //԰�������
    public double getRadius(){
        double area = Math.PI * radius * radius;
        return area;
    }
}
