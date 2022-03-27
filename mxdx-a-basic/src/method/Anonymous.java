package method;

/**
 * @author kinoz
 * @date 2022/3/24 - 15:14
 * @apiNote 匿名对象的使用
 */
public class Anonymous {
    public static void main(String[] args) {
        //正常创建对象使用
        pc p = new pc();
        p.talk();
        p.game();
        p.setPrice2(2999);

        System.out.println("--------------");
        //匿名对象的使用
        new pc().game();
        new pc().talk();

        System.out.println("--------------");
        //此处2000并不会赋值到setprice方法中
        // 因为匿名对象只可使用一次，结束就被回收了
        //每次new的都是一个新的对象
        new pc().price = 2000;
        new pc().setPrice();

        System.out.println("--------------");   //开发中常用
        pcmarket pm = new pcmarket();
        pm.show(new pc());
    }
}
class pcmarket{
    public void show(pc p){
        p.talk();
        p.game();
    }
}

class pc{
    int price;
    public void talk () {
        System.out.println("talk");
    }

    public void game(){
        System.out.println("play game");
    }

    public void setPrice(){
        System.out.println(price);
    }

    public void setPrice2(int a){
        System.out.println("手机价格为"+a);
    }
}
