package wutest.abstracttest.bigtest;

/**
 * @author kinoz
 * @date 2022/4/17 - 14:57
 * @apiNote �����¼Ա�������գ�Ȼ����Ϊһ������Employee��ȥʹ��
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
        return Year + "��" + Month +"��" + Day+"��";
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
