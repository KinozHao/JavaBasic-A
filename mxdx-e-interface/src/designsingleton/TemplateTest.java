package designsingleton;

/**
 * @author kinoz
 * @date 2022/4/17 - 14:42
 * @apiNote 模板设计模式的一种体现
 */
public class TemplateTest {
    public static void main(String[] args) {
        Template template = new SubTemplate();
        template.Code();
        template.spendTime();
    }
}
abstract class Template{
    //花费时间这个方法是确定的
    public void spendTime() {
        long start = System.currentTimeMillis();
        Code();
        long end = System.currentTimeMillis();

        System.out.println("花费的时间为："+(end-start));
    }

    //Code这个方法是不确定的具体需要子类去实例
    public abstract void Code();
}

class SubTemplate extends Template{
    @Override
    public void Code() {
        //输出1000以内的质数
        for (int i = 2; i < 1000; i++) {
            boolean isFlag = true;
            for (int j = 2;j<Math.sqrt(i);j++){
                if (i % j == 0){
                    isFlag = false;
                }
            }
            if (isFlag){
                System.out.println(i);
            }
        }
    }
}
