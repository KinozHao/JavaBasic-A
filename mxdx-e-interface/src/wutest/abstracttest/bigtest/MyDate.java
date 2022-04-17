package wutest.abstracttest.bigtest;

/**
 * @author kinoz
 * @date 2022/4/17 - 14:57
 * @apiNote 此类记录员工的生日，然后作为一个对象供Employee类去使用
 */
public class MyDate {
    private int Year;
    private int Month;
    private int Day;

    public MyDate(int year, int month, int day) {
        Year = year;
        Month = month;
        Day = day;
    }

    public String toDateString() {
        return Year + "年" + Month +"月" + Day+"日";
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }
}
