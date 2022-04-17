package wutest.abstracttest.bigtest;

/**
 * @author kinoz
 * @date 2022/4/17 - 14:53
 * @apiNote Ա���� �������ÿһ��Ա���ĸ�����Ϣ
 */
public abstract class Employee {
    private String name;
    private int number;
    //�����������͵�ʹ��
    private MyDate birthday;

    public abstract double earnings();

    /** @apiNote ʹ��birthday.toDateStringȥ��ȡMyDate�������ֵ*/
    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday.toDateString() +
                '}';
    }

    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
}
