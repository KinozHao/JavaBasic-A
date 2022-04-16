package designsingleton;

/**
 * @author kinoz
 * @date 2022/4/14 - 16:20
 * @apiNote ����ʽĿǰд���̲߳���ȫ(���̵߳���), �ӳٶ���Ĵ���
 */
public class Lazy {
    //1 ˽�й�����
    private Lazy() {
    }

    //2 �ڲ�������Ķ���(���뾲̬��)
    private static Lazy lazy = null;
    //3 �����ṩ���ڵķ��ʷ���
    public static Lazy getInstance(){

        //4 �ж���null������²�new����
        if (lazy == null){
            lazy = new Lazy();
        }
        //5 Ȼ�󷵻���Ķ���
        return lazy;
    }
}
