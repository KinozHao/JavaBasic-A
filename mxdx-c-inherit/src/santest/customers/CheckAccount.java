package santest.customers;

/**
 * @author kinoz
 * @date 2022/4/6 - 10:19
 * @apiNote 对基本Account类的继承 新增了可透支额度 用户在余额不足等情况下可以使用透支额度
 */
public class CheckAccount extends  Account{
    private double overdraft;       //可透支额度

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
    * @apiNote 对父类取钱方法的升级，增加了可透支额度
    * */
    @Override
    public void withdraw(double amount) {
        //余额足够的情况下
        if (getBalance() >= amount){
            //调用父类的方法
            super.withdraw(amount);
        }else if (overdraft >= amount - getBalance()){  //透支额度和余额加起来够
            overdraft -= (amount-getBalance());
            super.withdraw(getBalance());   //把余额取完
        }else{
            System.out.println("超过可透支限额");
        }
    }
}
