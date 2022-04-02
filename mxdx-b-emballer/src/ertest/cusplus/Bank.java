package ertest.cusplus;

/**
 * @author kinoz
 * @date 2022/3/30 - 16:41
 * @apiNote ������
 */
public class Bank {
    private Customer[] customers;   //��Ŷ���ͻ�������
    private int numberOfCustomer;   //��¼�ͻ�����

    public Bank(){          //customers�ĳ�ʼ��
        customers = new Customer[10];
    }

    //��ӿͻ�
    public void addCustomer(String f,String l){
        Customer cust = new Customer(f,l);

        //�ͻ��ı�� ÿ���һ������++һ��
        customers[numberOfCustomer] = cust;
        numberOfCustomer++;
    }
    //��ȡ�ͻ��ĸ���
    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    //��ȡָ��λ���ϵ�һ���ͻ�
    public Customer getCustomers(int index) {
        if (index >=0 && index < numberOfCustomer){
            return  customers[index];
        }else{
            throw new RuntimeException("����Խ��");
        }
    }
}
