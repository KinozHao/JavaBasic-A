package santest.customers;

/**
 * @author kinoz
 * @date 2022/4/6 - 10:05
 * @apiNote �����˻��� ��¼�ͻ������п� ��� �����ʵȵ�����
 */
public class Account {
    private int id; //���п���
    private double balance; //���
    private double annuallnterestRate;  //������

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
     * @apiNote ��Ǯ��������
     */
    public double getMonthlyInterest(){
        return annuallnterestRate / 12;
    }

    /**
     * @apiNote ȡǮ����
     */
    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
            return;
        }
        System.out.println("����");
    }

    /**
     * @apiNote ��Ǯ����
     */
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
    }
}
