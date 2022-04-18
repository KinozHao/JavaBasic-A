package designsingleton.proxy;

/**
 * @author kinoz
 * @date 2022/4/18 - 16:17
 * @apiNote ͨ���ӿڶԴ���ģʽ�ļ����
 * ͨ��һ�����վ�ķ�ʽ��������ģʽ
 * (��̬����)
 */
public class WebsiteTest {
    public static void main(String[] args) {
        //ͨ��������ֱ������ɱ�������Ĳ���
        ProxyServers pss = new ProxyServers(new RealWebsite());
        pss.servers();
    }
}
interface Online{
    void servers();
}

//���������վ
class RealWebsite implements Online{
    // ��ʵ��վ��Ҫ���ֵĶ���
    @Override
    public void servers() {
        System.out.println("�û�:��������վ����");
    }
}

//���������
class ProxyServers implements Online{
    private final Online online;

    //������ʵ���Ƕ�̬���������β��ǽӿ�ʵ����ʵ�ֽӿڵ�ʵ��(RealWebsite)
    public ProxyServers(Online online) {
        this.online = online;
    }
    //��վ�ڲ���Ҫ��Ķ������ɴ����������
    public void webTake() {
        System.out.println("������:��վ���ڲ��,����������");
    }

    @Override
    public void servers() {
        webTake();
        //���ճ��ֵĻ���RealWebsite������
        online.servers();
    }
}


