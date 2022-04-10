package santest.customers;

import org.junit.Test;

/**
 * @author kinoz
 * @date 2022/4/5 - 15:10
 * @apiNote account和checkAccount的测试类
 */
public class AccTest {

    @Test
    public void accountTest(){
        //新建一个账户
        Account act = new Account(1122, 20000, 0.045);

        //初始余额是不变的 因为要取金额直接大于余额了
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
        System.out.println("余额:"+ckat.getBalance());
        System.out.println("可透支余额:"+ckat.getOverdraft()+"\n");

        ckat.withdraw(18000);
        System.out.println("余额:"+ckat.getBalance());
        System.out.println("可透支余额:"+ckat.getOverdraft()+"\n");

        ckat.withdraw(3000);
        System.out.println("余额:"+ckat.getBalance());
        System.out.println("可透支余额:"+ckat.getOverdraft());
    }
}
