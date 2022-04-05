package santest.yuan;

/**
 * @author kinoz
 * @date 2022/4/4 - 15:04
 * @apiNote Բ����� Բ�������
 */
public class Cylinder extends Circle {
    private double length;

    public Cylinder(double length) {
        this.length = length;
    }

    public Cylinder() {
        length = 1.0;   //��ʼ����
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    //Բ�������  �����*��
    public double findVolume(){
        //���ø���Circle����
        //return Math.PI * getRadius() *getRadius() * length;
        return  super.findArea() * length;  //ͨ��super���ø���ķ����������Ǳ�����д���ķ���
    }

    //Բ���ı����
    @Override
    public double findArea() {
        return Math.PI * getRadius() * getRadius() * 2 +
                2 * Math.PI * getRadius() * length;
    }
}
