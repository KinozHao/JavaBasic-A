package experiment.text1;

/**
 * @author kinoz
 * @date 2022/3/30 - 15:59
 * @apiNote
 */
public class Account {
    private int id; //卡号
    private double balance; //余额
    private double annualInterestRate; //年利率

    public Account(int id, double balance, double annualInterestRate) { //构造器
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }


    public void withdraw(double amount){    //取钱方法
        if (balance < amount){
            System.out.println("余额不足，取款失败");
            return;
        }
        balance -=amount;
        System.out.println("成功取出:"+amount);
    }

    public void deposit(double amount){     //存钱方法
        if (balance > 0){
            balance += amount;
            System.out.println("存入成功: "+amount);
        }
    }

}
