package ainterface;

import org.junit.Test;

/**
 * @author kinoz
 * @date 2022/4/18 - 19:38
 * @apiNote jdk1.8后接口的新特征
 * 小概率冲突事件的分析
 */
public class Interface8 extends CDad implements A,B{
    //接口和父类出现同名的方法，实例类优先继承父类的方法(类优先原则)
    @Override
    public void bMethod() {
        super.bMethod();
        System.out.println("I8类default method");
    }

    public void jkMethod(){
        System.out.println("两个接口出现同名default怎么调用");
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
    //静态方法 可以有方法体 只能通过接口名.方法名称调用
    //不能被类实现
    static void aMethod(){
        System.out.println("接口A static method");
    }
    //默认方法 可以有方法体
    //类可以重写/不用重写都可以(重写后输出是重写后的内容)
    default void bMethod(){
        System.out.println("接口A default method");
    }
}

interface B{
    default void bMethod(){
        System.out.println("接口B default method");
    }
}

class CDad{
    public void bMethod(){
        System.out.println("父类中的bMethod方法");
    }
}
