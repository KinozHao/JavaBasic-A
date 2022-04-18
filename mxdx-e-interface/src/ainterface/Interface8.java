package ainterface;

import org.junit.Test;

/**
 * @author kinoz
 * @date 2022/4/18 - 19:38
 * @apiNote jdk1.8��ӿڵ�������
 * С���ʳ�ͻ�¼��ķ���
 */
public class Interface8 extends CDad implements A,B{
    //�ӿں͸������ͬ���ķ�����ʵ�������ȼ̳и���ķ���(������ԭ��)
    @Override
    public void bMethod() {
        super.bMethod();
        System.out.println("I8��default method");
    }

    public void jkMethod(){
        System.out.println("�����ӿڳ���ͬ��default��ô����");
        A.super.bMethod();
        B.super.bMethod();
    }

    @Test
    public void classTest(){
        Interface8 i = new Interface8();
        A.aMethod();
        System.out.println("________");
        i.bMethod();
        System.out.println("________");
        i.jkMethod();
    }



}
interface A{
    //��̬���� �����з����� ֻ��ͨ���ӿ���.�������Ƶ���
    //���ܱ���ʵ��
    static void aMethod(){
        System.out.println("�ӿ�A static method");
    }
    //Ĭ�Ϸ��� �����з�����
    //�������д/������д������(��д���������д�������)
    default void bMethod(){
        System.out.println("�ӿ�A default method");
    }
}

interface B{
    default void bMethod(){
        System.out.println("�ӿ�B default method");
    }
}

class CDad{
    public void bMethod(){
        System.out.println("�����е�bMethod����");
    }
}
