package ainterface;

/**
 * @author kinoz
 * @date 2022/4/17 - 20:15
 * @apiNote ͨ��USB��������������ӿڵĹ淶�ԣ���һ�������˶�̬��
 */
public class USBTest {
    public static void main(String[] args) {
        //�޴����ڵĶ�̬
        Computer.transferData(new Flash());
        Computer.transferData(new Printer());
    }
}

class Computer{
    //���һ������������Դ������ݾͱ�����ѭUSBЭ��
    public static void transferData(USB usb){
        usb.start();
        System.out.println("�������ݵĹ���~~~~~~~~");
        usb.stop();
    }
}

interface USB{
    //�������Ĳ���ȫ��Ϊ����
    int SPEED_THREE = 700;

    //����
    void start();
    //ֹͣ
    void stop();
}
//U����
class Flash implements USB{

    @Override
    public void start() {
        System.out.println("U�̹���");
    }

    @Override
    public void stop() {
        System.out.println("U�̽�������");
    }
}
//��ӡ����
class Printer implements USB{

    @Override
    public void start() {
        System.out.println("��ӡ������");
    }

    @Override
    public void stop() {
        System.out.println("��ӡ����������");
    }
}