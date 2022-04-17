package wutest.abstracttest.bigtest;

/**
 * @author kinoz
 * @date 2022/4/17 - 14:53
 * @apiNote 员工类 用来存放每一个员工的个人信息
 */
public abstract class Employee {
    private String name;
    private int number;
    //引用数据类型的使用
    private MyDate birthday;

    public abstract double earnings();

    /** @apiNote 使用birthday.toDateString去获取MyDate类里面的值*/
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
