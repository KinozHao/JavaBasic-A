package santest.customers;

/**
 * @author kinoz
 * @date 2022/4/5 - 15:10
 * @apiNote
 */
public class AccountTest {
    public static void main(String[] args) {
        Account act = new Account(1122, 20000, 0.045);

        act.withdraw(30000);
        System.out.println("balance: "+ act.getBalance());

        act.withdraw(2500);
        System.out.println("balance: "+ act.getBalance());

        act.deposit(3000);
        System.out.println("balance: "+ act.getBalance());
        System.out.println("interest: "+ (act.getMonthlyInterest() * 100)+"%");
    }
}
