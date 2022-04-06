package santest.customers;

/**
 * @author kinoz
 * @date 2022/4/6 - 10:05
 * @apiNote 银行账户类 记录客户的银行卡 余额 月利率等等数据
 */
public class Account {
    private int id; //银行卡号
    private double balance; //余额
    private double annuallnterestRate;  //月利率

    public Account() {
    }

    public Account(int id, double balance, double annuallnterestRate) {
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
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

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    /**
     * @apiNote 存钱的月利率
     */
    public double getMonthlyInterest(){
        return annuallnterestRate / 12;
    }

    /**
     * @apiNote 取钱方法
     */
    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
            return;
        }
        System.out.println("余额不足");
    }

    /**
     * @apiNote 存钱方法
     */
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
    }
}
