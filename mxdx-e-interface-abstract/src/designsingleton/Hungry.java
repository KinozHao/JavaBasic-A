package designsingleton;

/**
 * @author kinoz
 * @date 2022/4/14 - 16:20
 * @apiNote ����ʽ���̰߳�ȫ��,�������ʱ��̫��
 */
public class Hungry {

    //1 ˽����Ĺ�����(�ⲿ�Ͳ��������)
    private Hungry(){}

    //2 �ڲ�������Ķ���(���뾲̬��)
    private static Hungry hungry = new Hungry();

    //3 �����ṩpublic��̬����,������Ķ���
    public static Hungry getHungry() {
        return hungry;
    }
}
