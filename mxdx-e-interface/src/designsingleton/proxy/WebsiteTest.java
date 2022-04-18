package designsingleton.proxy;

/**
 * @author kinoz
 * @date 2022/4/18 - 16:17
 * @apiNote 通过接口对代理模式的简单理解
 * 通过一个搭建网站的方式来理解代理模式
 * (静态代理)
 */
public class WebsiteTest {
    public static void main(String[] args) {
        //通过代理类直接来完成被代理类的操作
        ProxyServers pss = new ProxyServers(new RealWebsite());
        pss.servers();
    }
}
interface Online{
    void servers();
}

//被代理的网站
class RealWebsite implements Online{
    // 真实网站需要呈现的东西
    @Override
    public void servers() {
        System.out.println("用户:真正的网站呈现");
    }
}

//代理服务商
class ProxyServers implements Online{
    private final Online online;

    //这里其实就是多态，构造器形参是接口实参是实现接口的实例(RealWebsite)
    public ProxyServers(Online online) {
        this.online = online;
    }
    //网站内部需要搭建的东西就由代理类来完成
    public void webTake() {
        System.out.println("代理商:网站的内部搭建,服务器部署");
    }

    @Override
    public void servers() {
        webTake();
        //最终呈现的还是RealWebsite的内容
        online.servers();
    }
}


