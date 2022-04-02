package ertest.cusplus;

/**
 * @author kinoz
 * @date 2022/3/30 - 16:41
 * @apiNote 银行类
 */
public class Bank {
    private Customer[] customers;   //存放多个客户的数组
    private int numberOfCustomer;   //记录客户个数

    public Bank(){          //customers的初始化
        customers = new Customer[10];
    }

    //添加客户
    public void addCustomer(String f,String l){
        Customer cust = new Customer(f,l);

        //客户的标号 每添加一个属性++一次
        customers[numberOfCustomer] = cust;
        numberOfCustomer++;
    }
    //获取客户的个数
    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    //获取指定位置上的一个客户
    public Customer getCustomers(int index) {
        if (index >=0 && index < numberOfCustomer){
            return  customers[index];
        }else{
            throw new RuntimeException("数组越界");
        }
    }
}
