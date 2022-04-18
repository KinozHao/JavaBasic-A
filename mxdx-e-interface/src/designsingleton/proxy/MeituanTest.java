package designsingleton.proxy;

/**
 * @author kinoz
 * @date 2022/4/18 - 16:34
 * @apiNote ͨ���ӿڶԴ���ģʽ�ļ����
 * ���Ű�����ʾ(��̬����)
 */
public class MeituanTest {
    public static void main(String[] args) {
        //new Horseman������Ƕ�̬(MtDaily daily = new Customer())
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
    final String name = "����";
    //����������Щ��������ֻ��Ҫ�ȴ�������
    @Override
    public void mtFood() {
        System.out.println(name+"������������");
    }
    @Override
    public void mtDrug() {
        System.out.println(name+"���Ŵ�ҩ����������ҩ"+'\n');
    }

    //��������Ҫ����
    public static void cusDo(){
        System.out.println("��л����5�Ǻ���");
        System.out.println("������������ʼ��");
    }
}

class Horseman implements MtDaily {
    private MtDaily daily;

    public Horseman(MtDaily daily){
        this.daily = daily;
    }


    //������Щ�������������
    @Override
    public void mtFood() {
        daily.mtFood();
    }
    @Override
    public void mtDrug() {
        daily.mtDrug();
    }

    public static void HorDo(){
        System.out.println("�����ѽӵ�");
        System.out.println("����������"+'\n');
    }

}
