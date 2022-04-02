package ertest.cusplus;

/**
 * @author kinoz
 * @date 2022/3/30 - 16:41
 * @apiNote
 */
public class Customer {
    private String firstName;   //�ͻ���
    private String lastName;    //�ͻ���
    private Account account;

    public Customer(String f, String l){
        this.firstName = f;
        this.lastName = l;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
