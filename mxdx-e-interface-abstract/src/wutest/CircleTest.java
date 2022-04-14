package wutest;

/**
 * @author kinoz
 * @date 2022/4/13 - 16:49
 * @apiNote staticʹ������
 */
public class CircleTest {


    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1.getId());
        Circle circle2 = new Circle();
        System.out.println(circle2.getId());
        Circle circle3= new Circle(30);
        System.out.println(circle3.getId());

        System.out.println("����Բ����:"+Circle.getTotal());
    }
}

class Circle{
    private int radius;
    private int id; //Բid
    private static int init = 1001;   //��ʼ��Բid
    private static int total;   //��¼����Բ�ĸ���

    public Circle(){
        id = init++;    //ÿnewһ������id����һ��
        total++;        //ÿnewһ��������������һ��
    }

    public Circle(int radius){
        this();
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public int getId() {
        return id;
    }

    public static int getInit() {
        return init;
    }

    public static int getTotal() {
        return total;
    }
}
