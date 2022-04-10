package santest.mankids;

/**
 * @author kinoz
 * @date 2022/4/4 - 14:45
 * @apiNote
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids someKid = new Kids(17);
        someKid.printAge();     //自己本身定义的方法

        someKid.setSalary(0);   //父类
        someKid.setSex(1);      //父类

        someKid.manOrWoman();   //调用父类方法
        someKid.employed();    //重写父类方法
    }
}
