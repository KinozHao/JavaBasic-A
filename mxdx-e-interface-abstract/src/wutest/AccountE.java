package wutest;

/**
 * @author kinoz
 * @date 2022/4/13 - 17:12
 * @apiNote �˻��� ��̬����ʹ�ó�������
 */
public class AccountE {
    /**
     * @apiNote
     * accountId���п��˺�   pwd����
     * balance���  interestRate����
     * minMoney�������ٴ���
     */
    private int accountId;
    private  String pwd = "000000";
    private double balance;


    private static double interestRate;
    private static double minMoney = 1.0;
    public static int init = 1001; //��ʼ��id

    public AccountE(){
        //ÿ��һ������ ID�Զ�����1
        accountId = init++;
    }

    public AccountE(String pwd, double balance) {
        //ÿ��һ������ ID�Զ�����1
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
