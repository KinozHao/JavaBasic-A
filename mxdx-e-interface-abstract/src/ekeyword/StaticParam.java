package ekeyword;

import org.junit.Test;

/**
 * @author kinoz
 * @date 2022/4/13 - 15:37
 * @apiNote 静态方法的使用
 */
public class StaticParam {
    @Test
    public void methodTest(){

    }
}
class Person{
    int id;
    String name;

    //静态属性
    static String nation = "中国";
    // 静态方法
    public static void info(){
        //内部可调用静态方法
        national();
    }

    public static void national(){
        //内部可调用静态变量
        System.out.println("国籍是:"+nation);
    }

    //成员方法里面(静态和非静态方法/属性)都可以调用
    public void eat(){
        info();
        national();
        System.out.println(nation);
    }
}
