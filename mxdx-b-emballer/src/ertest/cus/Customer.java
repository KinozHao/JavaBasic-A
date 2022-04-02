package ertest.cus;

/**
 * @author kinoz
 * @date 2022/3/30 - 16:09
 * @apiNote
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;    //�����Լ�д���˻���

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account){
        this.account = account;
    }
}
