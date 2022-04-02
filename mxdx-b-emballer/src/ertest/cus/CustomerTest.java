package ertest.cus;

/**
 * @author kinoz
 * @date 2022/3/30 - 16:21
 * @apiNote
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer cus = new Customer("Jane","Smith");    //客户的姓名

        Account act = new Account(1000,2000,0.0123);    //客户的账户信心
        cus.setAccount(act);    // 把实参act信息 赋值给形参cus客户

        cus.getAccount().deposit(100);  //客户存钱
        cus.getAccount().withdraw(960); //客户取钱
        cus.getAccount().withdraw(2000);    //客户取钱

        System.out.println("Customer: "+cus.getLastName()+" "+cus.getFirstName());
        System.out.println("Account number:"+cus.getAccount().getId()+
                " 年利率: "+cus.getAccount().getAnnualInterestRate()
                +" balance: "+cus.getAccount().getBalance());
    }
}
