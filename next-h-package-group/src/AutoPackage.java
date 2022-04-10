import org.junit.Test;

/**
 * @author kinoz
 * @date 2022/4/10 - 21:43
 * @apiNote �Զ�װ��/���� jdk1.5��
 * ��String��ת��
 */
public class AutoPackage {

    @Test
    public void testAuto(){
        //�Զ�װ��1.5֮��
        int num = 1000;
        aMethod(num);

        //1.5֮ǰд��Ҫ����һ������ͨ�����η�ʽ��num����ȥ
        aMethod(new Integer(num));

        //�Զ�����
        Integer it1 = new Integer(300);
        System.out.println(it1.toString());

        int num2 = it1;
        System.out.println(num2 + 500);

        //�Զ�װ��
        int num3 = 100;
        Integer it2 = num3;
        System.out.println("��ʱΪInteger������:"+it2.toString());

    }


    public void aMethod(Object obj){ //��̬����
        System.out.println("������,������"+obj);
    }


    //������������/��װ��----->String
    //ͨ��String���ص�valueOf��������
    @Test
    public void testWithString(){
        int t1 = 100;
        String s1 = String.valueOf(t1);
        System.out.println(s1);

        Character c1 = new Character('A');
        String s2 = String.valueOf(c1);
        System.out.println(s2);

    }

    //String----->������������/��װ��
    //ͨ����װ���parseXXX()����
    @Test
    public void testReverseString(){
        String s1 = "123.456232";
        //�Զ���������
        float f1 = Float.parseFloat(s1);
        System.out.println(f1);

        String s2 = "TRUE";
        boolean b1 = Boolean.parseBoolean(s2);
        System.out.println(b1);
    }
}
