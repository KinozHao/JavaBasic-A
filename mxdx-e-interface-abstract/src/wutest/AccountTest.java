package wutest;

/**
 * @author kinoz
 * @date 2022/4/13 - 22:46
 * @apiNote accountE�����
 */
public class AccountTest {
    public static void main(String[] args) {
        AccountE ae = new AccountE();
        AccountE ae2 = new AccountE("66341331",3000000);

        //�������ʺ����ٴ��ֵ
        AccountE.setInterestRate(1.7);
        AccountE.setMinMoney(100);

        System.out.println(ae);
        System.out.println(ae2);

        //�û���ȡ���ʺ����ٴ�Ǯֵ
        System.out.println(ae.getMinMoney());
        System.out.println(ae.getInterestRate());
    }
}
