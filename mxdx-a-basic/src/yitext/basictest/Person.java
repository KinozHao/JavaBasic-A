package yitext.basictest;

/**
 * @author kinoz
 * @date 2022/3/2 - 18:33
 * @apiNote 要素 创建类 写属性方法 调用类 调用类里面属性方法
 */
public class Person {
    public static void main(String[] args) {
        Test2 pt = new Test2();
        pt.name = "Tom";
        pt.age =  20;
        pt.sex = 2;

        pt.study();
        pt.showAge();
        int newAge = pt.addAge(2);
        System.out.println(pt.name+"增加后的age: "+newAge);
        //*******新的一个对象和上面数据无关系
        Test2 pt2 = new Test2();
        pt2.showAge();
        pt2.addAge(111);
        pt2.showAge();
    }
}
class Test2 {
    String name;
    int age;
    /**
     * 1 means male
     * 2 means female
     * */
    int sex;
    public void study(){
        System.out.println("study");
    }
    public void showAge(){
        System.out.println("age: "+age);
    }
    public int addAge(int i){
        age += i;
        return age;
    }
}

