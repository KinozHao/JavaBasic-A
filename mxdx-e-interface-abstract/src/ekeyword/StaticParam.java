package ekeyword;

import org.junit.Test;

/**
 * @author kinoz
 * @date 2022/4/13 - 15:37
 * @apiNote ��̬������ʹ��
 */
public class StaticParam {
    @Test
    public void methodTest(){

    }
}
class Person{
    int id;
    String name;

    //��̬����
    static String nation = "�й�";
    // ��̬����
    public static void info(){
        //�ڲ��ɵ��þ�̬����
        national();
    }

    public static void national(){
        //�ڲ��ɵ��þ�̬����
        System.out.println("������:"+nation);
    }

    //��Ա��������(��̬�ͷǾ�̬����/����)�����Ե���
    public void eat(){
        info();
        national();
        System.out.println(nation);
    }
}
