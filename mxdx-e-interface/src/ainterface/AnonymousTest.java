package ainterface;

/**
 * @author kinoz
 * @date 2022/4/18 - 15:44
 * @apiNote 接USBTest、接口的匿名写法
 */
public class AnonymousTest {
    public static void main(String[] args) {
        //1 非匿名实现类的匿名对象(多态写法)
        Computer.transferData(new Flash());
        //2 接口匿名 类非匿名
        USB mp3 = new USB() {
            @Override
            public void start() {
                System.out.println("mp3工作");
            }

            @Override
            public void stop() {
                System.out.println("mp3停止工作");
            }
        };
        //3 接口匿名 类也匿名
        Computer.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("游戏机工作");
            }

            @Override
            public void stop() {
                System.out.println("游戏机停止工作");
            }
        });

    }
}
