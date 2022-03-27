package method;

/**
 * @author kinoz
 * @date 2022/1/15 - 11:53
 */
public class Test1 {
    public static void main(String[] args) {
        //创建了两个对象,用谁调用这个属性/方法就是谁的
        xs show = new xs();
        show.name = "Alex";
        show.age = 17;
        show.sex = 2;
        show.study();
        show.showAge();//此时的岁数为17
        int newAge = show.addAge(3);    //通过addAage方法相当于把age增加了3
        show.showAge();//此时的岁数为20

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
    public int addAge(int i){   //有形参
        age += i;
        return age;
    }
}
