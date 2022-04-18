package designsingleton.proxy;

/**
 * @author kinoz
 * @date 2022/4/18 - 16:34
 * @apiNote 通过接口对代理模式的简单理解
 * 美团案例演示(静态代理)
 */
public class MeituanTest {
    public static void main(String[] args) {
        //new Horseman里面就是多态(MtDaily daily = new Customer())
        Horseman horseman = new Horseman(new Customer());
        horseman.mtFood();
        horseman.mtDrug();
        Horseman.HorDo();
        Customer.cusDo();

    }
}

interface MtDaily {
    void mtFood();
    void mtDrug();
}

class Customer implements MtDaily {
    final String name = "吕威";
    //吕威点了这些东西，它只需要等待就行了
    @Override
    public void mtFood() {
        System.out.println(name+"点了美团外卖");
    }
    @Override
    public void mtDrug() {
        System.out.println(name+"美团大药房买了两盒药"+'\n');
    }

    //吕威后面要做的
    public static void cusDo(){
        System.out.println("答谢骑手5星好评");
        System.out.println("打开美团外卖开始吃");
    }
}

class Horseman implements MtDaily {
    private MtDaily daily;

    public Horseman(MtDaily daily){
        this.daily = daily;
    }


    //吕威这些需求由骑手完成
    @Override
    public void mtFood() {
        daily.mtFood();
    }
    @Override
    public void mtDrug() {
        daily.mtDrug();
    }

    public static void HorDo(){
        System.out.println("骑手已接单");
        System.out.println("骑手配送中"+'\n');
    }

}
