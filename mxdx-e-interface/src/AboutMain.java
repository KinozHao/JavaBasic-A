/**
 * @author kinoz
 * @date 2022/4/14 - 19:57
 * @apiNote main方法的使用
 */
public class AboutMain {
    //这个main方法作为程序的入口
    public static void main(String[] args) {
        //静态方法里调静态方法
        TestMain.main(args);    //类名直接调用
    }
}
class TestMain{
    //把main方法就作为一个简单的构造方法使用
    public static void main(String[] args) {
        //造一个长度为100的String类型数组
        args = new String[100];
        for (int i = 0; i < args.length; i++) {
            //给这个数组赋值
            args[i] = "args_"+i;
            //打印这个数组
            System.out.println(args[i]);
        }
    }
}
