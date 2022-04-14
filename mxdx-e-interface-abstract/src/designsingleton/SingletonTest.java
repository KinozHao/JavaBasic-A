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
    public void lazyTest(){
        System.out.println("懒汉式,判断是不是一个对象");
        //Lazy lazy3 = new Lazy(); 有可能创建多个对象
        Lazy lazy1 = Lazy.getInstance();
        Lazy lazy2 = Lazy.getInstance();
        System.out.println(lazy1 == lazy2);
    }

    @Test
    public void finalTest(){
        System.out.println("Final方法输出");
        FinalUs t1 = FinalUs.finalUs;
        FinalUs t2 = FinalUs.finalUs;
        System.out.println(t1 == t2);

    }
}


class FinalUs {
    private FinalUs(){}
    //加了final 参数就不可改变
    public static final FinalUs finalUs = new FinalUs();

}
