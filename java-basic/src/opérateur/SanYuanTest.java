package op��rateur;
/**
 * 1
 * �������ʽ�Ľ��Ϊboolean����
 * ���ݱ��ʽ����٣�����ִ�б��ʽ1�����Ǳ��ʽ2
 * ������ʽΪtrue ִ�б��ʽ1
 * ������ʽΪfalse ִ�б��ʽ2
 * ��Ԫ������ǿ���Ƕ�׵�
 * 2
 * ���ǿ�������Ԫ������ĵط��������Ը�дΪif else���
 * ��֮��������
 *
 * 3
 * �������ȿ���ʹ����Ԫ�ֿ���ʹ��if else
 * ����ʹ����Ԫ Ч�ʸ���
*/
public class SanYuanTest {
    public static void main(String[] args) {
        //��ȡ�������������ֵ
        int a = 1;
        int b = 2;
        int little = (a > b)? a : b;
        System.out.println("���ֵ: "+little);
        String little2 = (a > b) ? "a��" : "b��";
        System.out.println("˭��: "+little2);
        a++;
        String little3 = (a > b) ? "aС" : ((a == b) ? "���" : "a��");
        System.out.println("aС��/����/����b?,��ӡ���: "+little3);

        //��ȡ�����������ֵ
        int q = 30;
        int w = 20;
        int s = -49;
        int max = (q > w) ? q : w;
        int max2 = (max > s) ? max : s;
        System.out.println("������������: "+max2);

        //���Ƽ�����д���Ķ���̫��
        int max3 = (((q > w) ? q : w ) > s) ? ((q > w) ? q : w ) : s;
        System.out.println("������������: "+max3);



    }
}
