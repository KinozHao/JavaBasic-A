package op��rateur;
//���������
public class AriTest {
    public static void main(String[] args) {

        arithMethod();//���������ʵ��
        airthExerMethod();//�����������Ŀ


    }

    private static void arithMethod() {
        //%ȡ������
        //����ķ����뱻ģ���ķ�����ͬ
        //�����г���%���ж��Ƿ��ܱ����������
        int m1 =12;
        int n1 = 5;
        System.out.println("m1 % n1 = " + m1 % n1);
        int m2 = -12;
        int n2 = 5;
        System.out.println("m1 % n1 = " + m2 % n2);
        int m3 =12;
        int n3 = -5;
        System.out.println("m1 % n1 = " + m3 % n3);
        int m4 = -12;
        int n4 = -5;
        System.out.println("m4 % n4 = " + m4 % n4);

        System.out.println("�ָ��ߡ�������������������������������������������");

        //ǰ++ ��++
        int NUM1 = 10;
        int NUM2 = ++NUM1;
        System.out.println("N1="+NUM1+"\nN2="+NUM2);

        int NUM3 = 10;
        int NUM4 = NUM3++;
        System.out.println("N3="+NUM3+"\nN4="+NUM4);
        //ǰ-- ��--

        //ATTENTION
        //ǿ��ת��
        short s0 = 1;
        s0 = (short)(s0+1);
        System.out.println("ǿת���:"+s0);

        //����ת��Ϊ��int
        short t0 = 1;
        int t1 = t0+1;
        System.out.println("����ת��Ϊint���:"+t1);

        //����д������ı������������
        short s1 =1;
        s1--;
        System.out.println("������������:"+s1);
    }

    private static void airthExerMethod() {
        /**
         *   ���������
         *   �������һ������ ��ӡ��ʾ���ĸ�λ��ʮλ����λ��ֵ
         * */
        int a = 123;
        int bai = a / 100;
        int shi = a % 100 / 10;
        int ge = a % 10;
        System.out.println("��λ��"+bai);
        System.out.println("ʮλ��"+shi);
        System.out.println("��λ��"+ge);
    }

}
