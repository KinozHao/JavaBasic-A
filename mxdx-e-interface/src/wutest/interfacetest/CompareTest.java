package wutest.interfacetest;

/**
 * @author kinoz
 * @date 2022/4/18 - 18:58
 * @apiNote �Ƚ�Բ�뾶�Ĳ���
 */
public class CompareTest  {
    public static void main(String[] args) {
        CompareCircle a= new CompareCircle(3.2);
        CompareCircle b= new CompareCircle(3.2);
        int compareValue = a.compareTo(b);
        if (compareValue > 0){
            System.out.println("a��");
        }else if (compareValue < 0){
            System.out.println("b��");
        }else {
            System.out.println("��ͬ");
        }
        CompareCircle c= new CompareCircle(3.2);

        //��ͬ����ʱ��ͻ���������Զ�����쳣
        int compareValue2 = c.compareTo(new String());
        System.out.println(compareValue2);
    }
}
