package santest.customers;

/**
 * @author kinoz
 * @date 2022/4/6 - 10:19
 * @apiNote �Ի���Account��ļ̳� �����˿�͸֧��� �û������������¿���ʹ��͸֧���
 */
public class CheckAccount extends  Account{
    private double overdraft;       //��͸֧���

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public CheckAccount(int id, double balance, double annuallnterestRate, double overdraft) {
        super(id, balance, annuallnterestRate);
        this.overdraft = overdraft;
    }

    /**
    * @apiNote �Ը���ȡǮ�����������������˿�͸֧���
    * */
    @Override
    public void withdraw(double amount) {
        //����㹻�������
        if (getBalance() >= amount){
            //���ø���ķ���
            super.withdraw(amount);
        }else if (overdraft >= amount - getBalance()){  //͸֧��Ⱥ�����������
            overdraft -= (amount-getBalance());
            super.withdraw(getBalance());   //�����ȡ��
        }else{
            System.out.println("������͸֧�޶�");
        }
    }
}
