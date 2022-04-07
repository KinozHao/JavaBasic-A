package dkeyword;

/**
 * @author kinoz
 * @date 2022/4/7 - 21:31
 * @apiNote 几种多态常见的问题
 */
public class InstanceofTest {
    public static void main(String[] args) {
        Watch watch = new TraditionWatch();

        //1 编译通过 运行不通过
        if (watch instanceof SmartWatch) {  //判断对象watch是不是SmartWatch的实例
            SmartWatch smartWatch = (SmartWatch) watch;
        }
        //2 编译通过 运行不通过
        Watch watch2 = new Watch();
        TraditionWatch traditionWatch = (TraditionWatch)watch2;

        //都通过
         Object obj = new SmartWatch();
        Watch watch1 = (Watch)obj;

        //编译都不过 体现=意义 要么左右类型一样 要么右边为左边的子类
        //SmartWatch smartWatch =new TraditionWatch();
    }
}
