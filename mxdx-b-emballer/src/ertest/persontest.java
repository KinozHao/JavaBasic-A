package ertest;
/**
 * @author kinoz
 * @date 2022/3/27 - 19:17
 * @apiNote ��װ����ϰ
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(16);
        System.out.println("���Ϊ: "+p.getAge());
    }
}
class Person {
    private int age;
    private int num;
    public void setAge(int agee) {
        if (agee < 0 || agee >=130){    //�����Χ���
            //throw new RuntimeException("�������䷶Χ");
            System.out.println("�������");
            return;
        }
        age = agee;
    }

    public int getAge() {
        return age;
    }

/*    public int doNum(int numss){      ����д��
        num = numss;
        return num;
    }*/
}
