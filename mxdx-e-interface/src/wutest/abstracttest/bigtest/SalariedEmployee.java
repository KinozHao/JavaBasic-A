package wutest.abstracttest.bigtest;

/**
 * @author kinoz
 * @date 2022/4/17 - 15:01
 * @apiNote ���¹��˵Ĺ��ʼ��㷽ʽ��
 */
public class SalariedEmployee extends Employee {
    private double monthlySalary;

    @Override
    public double earnings() {
        return monthlySalary;
    }

    //����Ա��������Ϣ
    @Override
    public String toString() {
        return "SalariedEmployee:"+super.toString();
    }

    public SalariedEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    public SalariedEmployee(String name, int number, MyDate birthday,double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
