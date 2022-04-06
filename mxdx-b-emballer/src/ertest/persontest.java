package ertest;
/**
 * @author kinoz
 * @date 2022/3/27 - 19:17
 * @apiNote 封装的练习
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(16);
        System.out.println("年纪为: "+p.getAge());
    }
}
class Person {
    private int age;
    private int num;
    public void setAge(int agee) {
        if (agee < 0 || agee >=130){    //这个范围外的
            //throw new RuntimeException("超出年龄范围");
            System.out.println("传入错误");
            return;
        }
        age = agee;
    }

    public int getAge() {
        return age;
    }

/*    public int doNum(int numss){      错误写法
        num = numss;
        return num;
    }*/
}
