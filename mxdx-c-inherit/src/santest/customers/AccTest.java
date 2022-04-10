package santest.customers;

import org.junit.Test;

/**
 * @author kinoz
 * @date 2022/4/5 - 15:10
 * @apiNote account��checkAccount�Ĳ�����
 */
public class AccTest {

    @Test
    public void accountTest(){
        //�½�һ���˻�
        Account act = new Account(1122, 20000, 0.045);

        //��ʼ����ǲ���� ��ΪҪȡ���ֱ�Ӵ��������
        act.withdraw(30000);
        System.out.println("balance: "+ act.getBalance());

        act.withdraw(2500);
        System.out.println("balance: "+ act.getBalance());

        act.deposit(3000);
        System.out.println("balance: "+ act.getBalance());
        System.out.println("interest: "+ (act.getMonthlyInterest() * 100)+"%");
    }

    @Test
    public void checkAccountTest(){
        CheckAccount ckat = new CheckAccount(1122, 20000, 0.045,5000);

        ckat.withdraw(5000);
        System.out.println("���:"+ckat.getBalance());
        System.out.println("��͸֧���:"+ckat.getOverdraft()+"\n");

        ckat.withdraw(18000);
        System.out.println("���:"+ckat.getBalance());
        System.out.println("��͸֧���:"+ckat.getOverdraft()+"\n");

        ckat.withdraw(3000);
        System.out.println("���:"+ckat.getBalance());
        System.out.println("��͸֧���:"+ckat.getOverdraft());
    }
}
