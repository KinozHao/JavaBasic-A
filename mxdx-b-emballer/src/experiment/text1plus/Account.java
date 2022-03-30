package experiment.text1plus;

/**
 * @author kinoz
 * @date 2022/3/30 - 16:41
 * @apiNote
 */
public class Account {
    private double balance;
    public Account(double init_balance){
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt){    //存钱
        if (amt > 0){
            balance +=amt;
            System.out.println("存钱成功");
        }
    }
    public void withdraw(double amt){   //取钱
        if (balance >= amt){
            balance -= amt;
            System.out.println("取钱成功");
        }else{
            System.out.println("余额不做");
        }
    }
}
