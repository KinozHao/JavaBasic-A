package op��rateur;
/*        �����⣺
        ���Լ�ʵ���������������Ľ���
        �������£�*/
public class ExchangeTest {
    public static void main(String[] args) {
        //��λ�����������
            int x=5;
            int y=10;
            x=x^y; //5^10
            y=x^y; //5^10^10
            x=x^y; //5^10^5
            System.out.println(x);
            System.out.println(y);

        //��temp��ת��
            int q = 6;
            int w = 8;
            int temp = q;
            q = w;
            w = temp;
            System.out.println(q);
            System.out.println(w);
        /*  ʹ�õ����������������Ƽ�����tempʵ��������֮���ת��
            ��ʹ�õ�������������λ�����ص����������*/

        }
}
