package ertest.cusplus;

/**
 * @author kinoz
 * @date 2022/3/30 - 21:50
 * @apiNote 银行测试类
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        //添加一个客户
        bank.addCustomer("Jane ","Smith");

        // 连续操作
        //客户账户初始金额2000$
        bank.getCustomers(0).setAccount(new Account(2000));
        //客户取了500$
        bank.getCustomers(0).getAccount().withdraw(500);
        //客户存了30000
        bank.getCustomers(0).getAccount().deposit(30000);

        //信息
        String AccountInfo = " 账户余额 "+bank.getCustomers(0).getAccount().getBalance()+"$";
        String CustomerInfo = "客户: "+bank.getCustomers(0).getFirstName()+bank.getCustomers(0).getLastName();
        System.out.println(CustomerInfo+AccountInfo);
        System.out.println("银行有多少个客户: "+bank.getNumberOfCustomer());
    }
}
