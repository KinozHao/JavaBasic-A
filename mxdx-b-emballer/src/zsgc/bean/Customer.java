package zsgc.bean;

/**
 * @author kinoz
 * @date 2022/4/2 - 14:41
 * @apiNote ´ËÀàÎªÊµÌå¶ÔÏó£¬ÓÃÀ´·â×°¿Í»§ÐÅÏ¢
 */
public class Customer {
    private String name;    //¿Í»§ÐÕÃû
    private char gender;    //¿Í»§ÐÔ±ð
    private int age;    //¿Í»§Äê¼Í
    private String phone;    //¿Í»§µç»°ºÅ
    private String email;    //¿Í»§ÓÊÏä

    public Customer(){  //¿Õ²Î¹¹ÔìÆ÷

    }
    //this is a change with git push
    public Customer(String name, char gender, int age, String phone, String email) {    //È«²Î¹¹ÔìÆ÷
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
