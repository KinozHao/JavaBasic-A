package dkeyword;

/**
 * @author kinoz
 * @date 2022/4/7 - 21:31
 * @apiNote ���ֶ�̬����������
 */
public class InstanceofTest {
    public static void main(String[] args) {
        Watch watch = new TraditionWatch();

        //1 ����ͨ�� ���в�ͨ��
        if (watch instanceof SmartWatch) {  //�ж϶���watch�ǲ���SmartWatch��ʵ��
            SmartWatch smartWatch = (SmartWatch) watch;
        }
        //2 ����ͨ�� ���в�ͨ��
        Watch watch2 = new Watch();
        TraditionWatch traditionWatch = (TraditionWatch)watch2;

        //��ͨ��
         Object obj = new SmartWatch();
        Watch watch1 = (Watch)obj;

        //���붼���� ����=���� Ҫô��������һ�� Ҫô�ұ�Ϊ��ߵ�����
        //SmartWatch smartWatch =new TraditionWatch();
    }
}
