package method;

/**
 * @author kinoz
 * @date 2022/3/24 - 20:13
 * @apiNote ֵ���ݵ�����
 */
public class ValueTransfer {
    public static void main(String[] args) {
        //animal��Ķ���
        animal cat =new animal();
        //�����������
        cat.a =10;
        cat.b =20;

        ValueTransfer vt = new ValueTransfer(); //���������������Ҫ��������Ķ���
        vt.swap(cat);   //��ʱ��ooo����Ϊʵ�δ��ݵ�swap�������β�

        System.out.println("a:"+ cat.a+"b:"+ cat.b);
    }
    public void swap(animal othercat){  //��ʱ�β�Ϊ������������tooools
        int temp = othercat.a;
        othercat.a = othercat.b;
        othercat.b = temp;
    }
}
class animal {
    int a;
    int b;

}
