package method;

/**
 * @author kinoz
 * @date 2022/3/24 - 15:14
 * @apiNote ���������ʹ��
 */
public class Anonymous {
    public static void main(String[] args) {
        //������������ʹ��
        pc p = new pc();
        p.talk();
        p.game();
        p.setPrice2(2999);

        System.out.println("--------------");
        //���������ʹ��
        new pc().game();
        new pc().talk();

        System.out.println("--------------");
        //�˴�2000�����ḳֵ��setprice������
        // ��Ϊ��������ֻ��ʹ��һ�Σ������ͱ�������
        //ÿ��new�Ķ���һ���µĶ���
        new pc().price = 2000;
        new pc().setPrice();

        System.out.println("--------------");   //�����г���
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
        System.out.println("�ֻ��۸�Ϊ"+a);
    }
}
