package dkeyword;

import org.junit.Test;

/**
 * @author kinoz
 * @date 2022/4/7 - 21:31
 * @apiNote ���ֶ�̬����������
 */
public class InstanceofTest {
    //��̬����
    Watch watch = new TraditionWatch();

    @Test
    public void testOne() {
        Watch watch = new TraditionWatch();

        //1 ����ͨ�� ����ͨ��
        if (watch instanceof SmartWatch) {  //�ж϶���watch�ǲ���SmartWatch��ʵ��
            SmartWatch smartWatch = (SmartWatch) watch;
        }
    }

    @Test
    public void testTwo() {
        //2 ����ͨ�� ���в�ͨ��
        Watch watch2 = new Watch();
        TraditionWatch traditionWatch = (TraditionWatch)watch2;
    }

    @Test
    public void testThree() {
        //��ͨ��
        Object obj = new SmartWatch();
        Watch watch1 = (Watch)obj;

        //���붼���� ����=���� Ҫô��������һ�� Ҫô�ұ�Ϊ��ߵ�����
        //SmartWatch smartWatch =new TraditionWatch();
    }
}
