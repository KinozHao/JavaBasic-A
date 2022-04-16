package designsingleton;

import org.junit.Test;

/**
 *  @author kinoz
 *  @date 2022/4/14 - 16:20
 *  @apiNote �������ģʽ ����ʽ�����ʽ�Ĳ�����
* */

public class SingletonTest {
    @Test
    public void hungryTest() {
        System.out.println("����ʽ,�ж��ǲ���һ������");
        //Hungry hungry3 = new Hungry(); �����ٴ�������
        Hungry hungry1 = Hungry.getHungry();
        Hungry hungry2 = Hungry.getHungry();
        System.out.println(hungry1.equals(hungry2));
    }

    @Test
    public void hungryTwoTest(){
        HungryTwo ht = HungryTwo.essential;
        HungryTwo ht2 = HungryTwo.essential;
        //HungryTwo.essential = null;
        System.out.println(ht == ht2);
    }

    @Test
    public void lazyTest() {
        System.out.println("����ʽ,�ж��ǲ���һ������");
        //Lazy lazy3 = new Lazy(); �п��ܴ����������
        Lazy lazy1 = Lazy.getInstance();
        Lazy lazy2 = Lazy.getInstance();
        System.out.println(lazy1 == lazy2);
    }

}

