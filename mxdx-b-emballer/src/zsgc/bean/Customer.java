package zsgc.bean;

/**
 * @author kinoz
 * @date 2022/4/2 - 14:41
 * @apiNote 此类为实体对象，用来封装客户信息
 */
public class Customer {
    private String name;    //客户姓名
    private char gender;    //客户性别
    private int age;    //客户年纪
    private String phone;    //客户电话号
    private String email;    //客户邮箱

    public Customer(){  //空参构造器

    }

    public Customer(String name, char gender, int age, String phone, String email) {    //全参构造器
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
