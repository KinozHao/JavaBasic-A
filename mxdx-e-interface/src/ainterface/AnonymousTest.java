package ainterface;

/**
 * @author kinoz
 * @date 2022/4/18 - 15:44
 * @apiNote ��USBTest���ӿڵ�����д��
 */
public class AnonymousTest {
    public static void main(String[] args) {
        //1 ������ʵ�������������(��̬д��)
        Computer.transferData(new Flash());
        //2 �ӿ����� �������
        USB mp3 = new USB() {
            @Override
            public void start() {
                System.out.println("mp3����");
            }

            @Override
            public void stop() {
                System.out.println("mp3ֹͣ����");
            }
        };
        //3 �ӿ����� ��Ҳ����
        Computer.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("��Ϸ������");
            }

            @Override
            public void stop() {
                System.out.println("��Ϸ��ֹͣ����");
            }
        });

    }
}
