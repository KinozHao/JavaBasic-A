package zsgc.service;

import zsgc.bean.Customer;

/**
 * @author kinoz
 * @date 2022/4/2 - 14:42
 * @apiNote 为Customer对象的管理模块，内部用数组管理一组Customer对象，提供相应的增删改查和遍历方法，且供CustomerView调用
 */
public class CustomerList {
    private Customer[] customers;   //保存客户对象的数组
    private int total;          //记录已经保存客户的数量

    /** 1
    * 初始化customers数组的构造器
    * @param totalCustomer:指定数组的长度
    */
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }

    /** 2
     * 将指定的客户添加到数组中
     * @param customer
     * @return true:添加成功 false:添加失败
     */
    public boolean addCustomer(Customer customer){
        if (total >= customers.length){
            return false;
        }else {
            customers[total++] = customer;
            return true;
        }
    }

    /** 3
     * 修改指定索引位置的客户信息
     * @param index 客户索引
     * @param crust 新的索引
     * @return true:修改成功 false:修改失败
     */
    public boolean replaceCustomer(int index,Customer crust){
        if (index < 0 || index >= total){
            return false;
        }else {
            customers[index] = crust;
            return true;
        }
    }

    /** 4
     * 删除指定索引位置的客户信息
     * @param index 客户索引
     * @return true:删除成功 false:删除失败
     */
    public boolean deleteCustomer(int index){
        if (index < 0 || index >= total){
            return false;
        }else {
            for (int i = index; i < total-1 ; i++) {
                customers[i] =customers[i+1];
            }
            //最后有数据的元素需要置空
            customers[total-1] =null;
            total --;
            return true;
        }
    }

    /** 4
     * 返回所有客户信息
     * @return 返回的不是所有的数组，而是我们自己造的数组
     */
    public Customer[] getAllCustomer(){
        Customer[] crusts = new Customer[total];
        for (int i = 0; i < total; i++) {
            // 赋的是索引值 不是数组 意思就是crusts和customers指向的是同一个对象实体
            crusts[i] = customers[i];
        }
        return crusts;
    }

    /** 6
     * 获取指定索引位置的客户信息
     * @return 如果找到了元素则返回 没找到返回null
     */
    public Customer getCustomer(int index){
        if (index < 0 || index >= total){
            return null;
        }
        return customers[index];
    }

    /** 7
     * 获取存储客户的数量
     */
    public int getTotal(){
        return total;
    }
}
