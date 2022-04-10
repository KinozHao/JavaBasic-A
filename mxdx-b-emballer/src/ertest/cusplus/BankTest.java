package ertest.cusplus;

/**
 * @author kinoz
 * @date 2022/3/30 - 21:50
 * @apiNote ���в�����
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        //���һ���ͻ�
        bank.addCustomer("Jane ","Smith");

        // ��������
        //�ͻ��˻���ʼ���2000$
        bank.getCustomers(0).setAccount(new Account(2000));
        //�ͻ�ȡ��500$
        bank.getCustomers(0).getAccount().withdraw(500);
        //�ͻ�����30000
        bank.getCustomers(0).getAccount().deposit(30000);

        //��Ϣ
        String AccountInfo = " �˻���� "+bank.getCustomers(0).getAccount().getBalance()+"$";
        String CustomerInfo = "�ͻ�: "+bank.getCustomers(0).getFirstName()+bank.getCustomers(0).getLastName();
        System.out.println(CustomerInfo+AccountInfo);
        System.out.println("�����ж��ٸ��ͻ�: "+bank.getNumberOfCustomer());
    }
}
