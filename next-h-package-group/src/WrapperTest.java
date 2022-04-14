import org.junit.Test;

/**
 * @author kinoz
 * @date 2022/4/10 - 21:15
 * @apiNote ��װ��<---->������������ת��
 */
public class WrapperTest {

    // ������������---->��װ��(���ù�����)
    @Test
    public void normalTest(){
        //���ð�װ��Ĺ��������ѻ����������ͷŽ�ȥ����
        //������װ �;����˵��÷����Ĺ���
        Integer i1 = new Integer(300);
        System.out.println(i1.toString());

        //����ΪStringʱ��ֻ��Ϊ�����֣�����ͻᱨ��
        Integer i2 = new Integer("300");
        System.out.println(i2.toString());

        //String״̬�²���true����ʣ����ؾ���false
        Boolean b1 = new Boolean("trdue");
        Boolean b2 = new Boolean("false");
        System.out.println(b1);
        System.out.println(b2);
    }

    //��װ��---->������������ת��(����xxxValue)
    @Test
    public void revereTest(){
        Float ft = new Float(13.2);
        float ft2 = ft.floatValue();
        System.out.println(ft2 + 26.9);
    }

    public void orderTest(){
        Order or = new Order();
        System.out.println(or.isFlag);  //booleanĬ�Ϸ���false
        System.out.println(or.isFLAG);  //��װ�࣬����ֵ��Ĭ�����null
    }
}

class Order {
    boolean isFlag;
    Boolean isFLAG;
}
