import org.junit.Test;

/**
 * @author kinoz
 * @date 2022/4/10 - 22:39
 * @apiNote ������
 */
public class InterviewTest {
    @Test
    public void interviewTest(){
        //������������ �Ƚϵĵ�ֵַ
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i1 == i2);

        //�Զ����� �Ƚϵ���ֵ
        Integer a = 2;
        Integer b = 2;
        System.out.println(a == b);

        /**
         * @apiNote
         * ����Ϊfalse ���忴IntegerԴ���IntegerCache�ṹ�ĵ�Integer[]
         * Integer[]������-128~127������
         * �ڴ˷�Χ��,ֱ��ʹ�ô�����Ԫ��,������new,��߿���Ч��
         */
        //x��y�൱��new���������� �Ƚϵ��ǵ�ֵַ��
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);
    }
}
