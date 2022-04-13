package wutest;

/**
 * @author kinoz
 * @date 2022/4/13 - 17:12
 * @apiNote 账户类 静态变量使用场景体现
 */
public class AccountE {
    /**
     * @apiNote
     * accountId银行卡账号   pwd密码
     * balance余额  interestRate利率
     * minMoney开卡最少存入
     */
    private int accountId;
    private  String pwd = "000000";
    private double balance;


    private static double interestRate;
    private static double minMoney = 1.0;
    public static int init = 1001; //初始化id

    public AccountE(){
        //每造一个对象 ID自动增加1
        accountId = init++;
    }

    public AccountE(String pwd, double balance) {
        //每造一个对象 ID自动增加1
        accountId = init++;
        this.pwd = pwd;
        this.balance = balance;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        AccountE.interestRate = interestRate;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        AccountE.minMoney = minMoney;
    }

    @Override
    public String toString() {
        return "AccountE{" +
                "accountId=" + accountId +
                ", pwd='" + pwd + '\'' +
                ", balance=" + balance +
                '}';
    }
}
