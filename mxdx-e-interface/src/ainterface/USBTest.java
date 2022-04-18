package ainterface;

/**
 * @author kinoz
 * @date 2022/4/17 - 20:15
 * @apiNote 通过USB案例来具体分析接口的规范性，又一次体现了多态性
 */
public class USBTest {
    public static void main(String[] args) {
        //无处不在的多态
        Computer.transferData(new Flash());
        Computer.transferData(new Printer());
    }
}

class Computer{
    //如果一个东西想向电脑传输数据就必须遵循USB协议
    public static void transferData(USB usb){
        usb.start();
        System.out.println("传输数据的过程~~~~~~~~");
        usb.stop();
    }
}

interface USB{
    //定义具体的参数全部为常量
    int SPEED_THREE = 700;

    //开启
    void start();
    //停止
    void stop();
}
//U盘类
class Flash implements USB{

    @Override
    public void start() {
        System.out.println("U盘工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
    }
}
//打印机类
class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}