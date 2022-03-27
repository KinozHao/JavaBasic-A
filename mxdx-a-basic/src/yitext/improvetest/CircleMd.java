package yitext.improvetest;

/**
 * @author kinoz
 * @date 2022/3/25 - 11:09
 * @apiNote 值传递练习题  VIDEOS P215
 */
public class CircleMd {
    public static void main(String[] args) {
        circle c = new circle();

        CircleMd cmd = new CircleMd();

        cmd.printArea(c,5);

        System.out.println("now radius is: "+c.radius);
    }
    public void printArea(circle c,int time){
        System.out.println("Radius\t\tArea");
        for (int i = 1; i <= time; i++) {
            //设置园的半径
            c.radius = i;
            System.out.println(c.radius+"\t\t"+c.findArea());
        }
        c.radius = time+1;


    }
}
class circle{
    double radius;  //园的半径
    public double findArea(){   //圆面积的方法
        return Math.PI * radius * radius;
    }
}
