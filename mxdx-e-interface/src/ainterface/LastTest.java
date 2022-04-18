package ainterface;

import org.junit.Test;

/**
 * @author kinoz
 * @date 2022/4/18 - 20:05
 * @apiNote interface���� 'help witch one'
 */
public class LastTest extends Dad implements Mom,Wife {
    @Override
    public void help() {
        //д���൱���Լ����뷨
        //System.out.println("������");
        //�൱������Dad��
        super.help();
        //�൱�ھ�1
        Mom.super.help();
        //�൱�ھ�2
        Wife.super.help();
    }



    @Test
    public void finalTest(){
        LastTest lastTest = new LastTest();
        //������ȷ�����׾�˭
        lastTest.help();
    }
}

class Dad{
    public void help(){
        System.out.println("��1");
    }
}
interface Mom{
    default void help(){
        System.out.println("1����");
    }
}
interface Wife{
    default void help(){
        System.out.println("2����");
    }
}
