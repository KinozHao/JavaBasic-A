package designsingleton;

import org.junit.Test;

/**
 *  @author kinoz
 *  @date 2022/4/14 - 16:20
 *  @apiNote 单列设计模式 懒汉式与饿汉式的测试类
* */

public class SingletonTest {
    @Test
    public void hungryTest() {
        System.out.println("饿汉式,判断是不是一个对象");
        //Hungry hungry3 = new Hungry(); 不可再创建对象
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
        System.out.println("懒汉式,判断是不是一个对象");
        //Lazy lazy3 = new Lazy(); 有可能创建多个对象
        Lazy lazy1 = Lazy.getInstance();
        Lazy lazy2 = Lazy.getInstance();
        System.out.println(lazy1 == lazy2);
    }

}

