package designsingleton;

/**
 * @author kinoz
 * @date 2022/4/14 - 16:20
 * @apiNote 饿汉式是线程安全的,对象加载时间太长
 */
public class Hungry {

    //1 私有类的构造器(外部就不能造对象)
    private Hungry(){}

    //2 内部创建类的对象(必须静态化)
    private static Hungry hungry = new Hungry();

    //3 对外提供public静态方法,返回类的对象
    public static Hungry getHungry() {
        return hungry;
    }
}
