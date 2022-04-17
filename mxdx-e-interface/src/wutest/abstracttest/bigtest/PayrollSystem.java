package wutest.abstracttest.bigtest;

import java.util.Calendar;

/**
 * @author kinoz
 * @date 2022/4/17 - 15:33
 * @apiNote 员工类的具体测试
 */
public class PayrollSystem {
    public static void main(String[] args) {
        //方式一
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("当月月份是:");
        int month = scanner.nextInt();*/

        //方式二 使用Calendar类的方法
        Calendar calendar = Calendar.getInstance();
        //要注意的是月份的索引是从0开始的
        int month2 = calendar.get(Calendar.MONTH);  //获取当前的月份

        //声明一个Employee类型的数组，默认可以存放两个对象(用来实例化子类)
        Employee [] emp = new Employee[2];
        //按月的类
        emp[0] = new SalariedEmployee("Lily",1001,
                new MyDate(2000,4,4),13000);

        //按小时的类
        emp[1] = new HourlyEmployee("Jack",4003,
                new MyDate(2003,8,3),260,88);

        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);
            double salary = emp[i].earnings();
            System.out.println("月工资: "+salary);
            //因为月份索引是从0开始所以要+1
            if (month2 + 1 == emp[i].getBirthday().getMonth()) {
                System.out.println("生日福利:当月工资增加100元");
            }
        }

    }
}
