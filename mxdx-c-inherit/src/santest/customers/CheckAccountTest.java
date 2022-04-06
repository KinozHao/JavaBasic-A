package santest.customers;

/**
 * @author kinoz
 * @date 2022/4/6 - 10:33
 * @apiNote
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount ckat = new CheckAccount(1122, 20000, 0.045,5000);

        ckat.withdraw(5000);
        System.out.println("”‡∂Ó:"+ckat.getBalance());
        System.out.println("ø…Õ∏÷ß”‡∂Ó:"+ckat.getOverdraft()+"\n");

        ckat.withdraw(18000);
        System.out.println("”‡∂Ó:"+ckat.getBalance());
        System.out.println("ø…Õ∏÷ß”‡∂Ó:"+ckat.getOverdraft()+"\n");

        ckat.withdraw(3000);
        System.out.println("”‡∂Ó:"+ckat.getBalance());
        System.out.println("ø…Õ∏÷ß”‡∂Ó:"+ckat.getOverdraft());
    }
}
