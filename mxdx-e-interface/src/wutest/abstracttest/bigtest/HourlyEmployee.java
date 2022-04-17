package wutest.abstracttest.bigtest;

/**
 * @author kinoz
 * @date 2022/4/17 - 15:11
 * @apiNote 按时薪工人的工资计算方式类
 */
public class HourlyEmployee extends Employee{
    private double wage;    //每小时的工资
    private double hour;    //月小时总数

    //重写父类方法 返回的为工资
    @Override
    public double earnings() {
        return wage*hour;
    }
    //返回员工个人信息
    @Override
    public String toString() {
        return "HourlyEmployee:"+super.toString();
    }

    public HourlyEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);

    }

    public HourlyEmployee(String name, int number, MyDate birthday,double wage,double hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;

    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }
}
