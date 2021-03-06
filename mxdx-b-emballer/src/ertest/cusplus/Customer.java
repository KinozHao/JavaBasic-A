package ertest.cusplus;

/**
 * @author kinoz
 * @date 2022/3/30 - 16:41
 * @apiNote
 */
public class Customer {
    private String firstName;   //客户姓
    private String lastName;    //客户名
    private Account account;

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
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
