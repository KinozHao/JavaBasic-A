package zsgc.bean;

/**
 * @author kinoz
 * @date 2022/4/2 - 14:41
 * @apiNote ����Ϊʵ�����������װ�ͻ���Ϣ
 */
public class Customer {
    private String name;    //�ͻ�����
    private char gender;    //�ͻ��Ա�
    private int age;    //�ͻ����
    private String phone;    //�ͻ��绰��
    private String email;    //�ͻ�����

    public Customer(){  //�ղι�����

    }

    public Customer(String name, char gender, int age, String phone, String email) {    //ȫ�ι�����
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
