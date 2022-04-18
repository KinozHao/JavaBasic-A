package wutest.interfacetest;

/**
 * @author kinoz
 * @date 2022/4/18 - 18:42
 * @apiNote �Ƚ�Բ�İ뾶
 */
public class CompareCircle extends Circle implements CompareObject {
    public CompareCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o){
            return 0;
        }
        if (o instanceof CompareCircle){
            CompareCircle cc = (CompareCircle) o;
            //ʹ���ж����
            /*if (this.getRadius() > cc.getRadius()){
                return 1;
            }else if (this.getRadius() < cc.getRadius()){
                return  -1;
            }else {
                return 0;
            }*/
            //ʹ�ð�װ�෽�� ǰ������������Ϊ��װ��
            return this.getRadius().compareTo(cc.getRadius());
        }else {
            //return 0;
            throw new RuntimeException("������ֵ��ƥ��");
        }
    }

}
