package ainterface;

import org.junit.Test;

/**
 * @author kinoz
 * @date 2022/4/18 - 20:05
 * @apiNote interface案例 'help witch one'
 */
public class LastTest extends Dad implements Mom,Wife {
    @Override
    public void help() {
        //写了相当于自己的想法
        //System.out.println("都不救");
        //相当于听你Dad的
        super.help();
        //相当于救1
        Mom.super.help();
        //相当于救2
        Wife.super.help();
    }



    @Test
    public void finalTest(){
        LastTest lastTest = new LastTest();
        //最终你确定到底救谁
        lastTest.help();
    }
}

class Dad{
    public void help(){
        System.out.println("救1");
    }
}
interface Mom{
    default void help(){
        System.out.println("1救我");
    }
}
interface Wife{
    default void help(){
        System.out.println("2救我");
    }
}
