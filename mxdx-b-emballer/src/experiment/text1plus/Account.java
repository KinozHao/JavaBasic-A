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

    public void deposit(double amt){    //��Ǯ
        if (amt > 0){
            balance +=amt;
            System.out.println("��Ǯ�ɹ�");
        }
    }
    public void withdraw(double amt){   //ȡǮ
        if (balance >= amt){
            balance -= amt;
            System.out.println("ȡǮ�ɹ�");
        }else{
            System.out.println("����");
        }
    }
}
