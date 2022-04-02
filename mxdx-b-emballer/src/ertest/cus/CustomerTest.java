package ertest.cus;

/**
 * @author kinoz
 * @date 2022/3/30 - 16:21
 * @apiNote
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer cus = new Customer("Jane","Smith");    //�ͻ�������

        Account act = new Account(1000,2000,0.0123);    //�ͻ����˻�����
        cus.setAccount(act);    // ��ʵ��act��Ϣ ��ֵ���β�cus�ͻ�

        cus.getAccount().deposit(100);  //�ͻ���Ǯ
        cus.getAccount().withdraw(960); //�ͻ�ȡǮ
        cus.getAccount().withdraw(2000);    //�ͻ�ȡǮ

        System.out.println("Customer: "+cus.getLastName()+" "+cus.getFirstName());
        System.out.println("Account number:"+cus.getAccount().getId()+
                " ������: "+cus.getAccount().getAnnualInterestRate()
                +" balance: "+cus.getAccount().getBalance());
    }
}
