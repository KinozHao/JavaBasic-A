package wutest.abstracttest.bigtest;

/**
 * @author kinoz
 * @date 2022/4/17 - 15:11
 * @apiNote ��ʱн���˵Ĺ��ʼ��㷽ʽ��
 */
public class HourlyEmployee extends Employee{
    private double wage;    //ÿСʱ�Ĺ���
    private double hour;    //��Сʱ����

    //��д���෽�� ���ص�Ϊ����
    @Override
    public double earnings() {
        return wage*hour;
    }
    //����Ա��������Ϣ
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
