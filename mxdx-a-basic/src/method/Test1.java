package method;

/**
 * @author kinoz
 * @date 2022/1/15 - 11:53
 */
public class Test1 {
    public static void main(String[] args) {
        //��������������,��˭�����������/��������˭��
        xs show = new xs();
        show.name = "Alex";
        show.age = 17;
        show.sex = 2;
        show.study();
        show.showAge();//��ʱ������Ϊ17
        int newAge = show.addAge(3);    //ͨ��addAage�����൱�ڰ�age������3
        show.showAge();//��ʱ������Ϊ20

        xs show2 = new xs();
        show2.name = "Alex2";
        show2.showAge();
        show2.addAge(35);
        show2.showAge();
    }
}
class xs{
    String name;
    int age;
    int sex;
    public void study(){
        System.out.println(name+"is studying");
    }
    public void showAge(){
        System.out.println(name+"'s age: "+age);
    }
    public int addAge(int i){   //���β�
        age += i;
        return age;
    }
}
