package designsingleton;

/**
 * @author kinoz
 * @date 2022/4/14 - 16:20
 * @apiNote 懒汉式目前写法线程不安全(多线程调试), 延迟对象的创建
 */
public class Lazy {
    //1 私有构造器
    private Lazy() {
    }

    //2 内部创建类的对象(必须静态化)
    private static Lazy lazy = null;
    //3 对外提供公众的访问方法
    public static Lazy getInstance(){

        //4 判断在null的情况下才new对象
        if (lazy == null){
            lazy = new Lazy();
        }
        //5 然后返回类的对象
        return lazy;
    }
}
