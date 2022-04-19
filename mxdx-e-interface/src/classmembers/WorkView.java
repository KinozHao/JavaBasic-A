package classmembers;

/**
 * @author kinoz
 * @date 2022/4/19 - 22:03
 * @apiNote 开发中一般这么使用内部类
 */
public class WorkView {
    //返回值类型为Comparable接口
    public Comparable getComparable() {
        //把内部类作为实例类来实现Comparable接口
        class MyComparable implements Comparable {
            //重写接口的方法
            @Override
            public int compareTo(Object o) {
                return 0;
            }

        }
        //返回一个接口的实例给供方法调用
        //return new MyComparable();

        //匿名内部类写法
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
